package com.pmngt.projectmanagement.service;

import com.pmngt.projectmanagement.dto.RegisterRequest;
import com.pmngt.projectmanagement.persistence.model.NotificationEmail;
import com.pmngt.projectmanagement.persistence.model.User;
import com.pmngt.projectmanagement.persistence.model.VerificationToken;
import com.pmngt.projectmanagement.persistence.repository.UserRepository;
import com.pmngt.projectmanagement.persistence.repository.VerificationTokenRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import static com.pmngt.projectmanagement.util.Constants.ACTIVATION_EMAIL;
import static java.time.Instant.now;

@Service
@AllArgsConstructor
@Slf4j
public class AuthService { // In charge of creating new user and storing it in the database
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final VerificationTokenRepository verificationTokenRepository;
    private final MailContentBuilder mailContentBuilder;
    private final MailService mailService;

    @Transactional
    public void signup(RegisterRequest registerRequest) { // DTO object containing User data
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodePassword(registerRequest.getPassword())); // Encode password using BCrypt
        user.setCreated(now());
        user.setEnabled(false); // disable user until user verify's email

        userRepository.save(user); // save to database

        String token = generateVerificationToken(user); // creates token for user activation

        String message = mailContentBuilder.build("Thank you for signing up to the Project Management Application, please" +
                "click on the below url to activate your account!" + ACTIVATION_EMAIL + "/" + token);

        mailService.sendMail(new NotificationEmail("Please Activate your account: ", user.getEmail(), message));
    }

    private String generateVerificationToken(User user) { // token sent as part of verification email
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);
        verificationTokenRepository.save(verificationToken);
        return token;
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    // Need to add method for verifying accounts and enabling after they activate the accounts.
}
