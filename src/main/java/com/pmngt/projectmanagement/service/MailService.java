package com.pmngt.projectmanagement.service;

import com.pmngt.projectmanagement.exceptions.ProjectManagementException;
import com.pmngt.projectmanagement.persistence.model.NotificationEmail;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class MailService {

    private final JavaMailSender mailSender;
    private final MailContentBuilder mailContentBuilder;

    void sendMail(NotificationEmail notificationEmail) {
        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage); // helps build mime message
            messageHelper.setFrom("projectMgmt@email.com");
            messageHelper.setTo(notificationEmail.getRecipientt()); // grab from notification email object
            messageHelper.setSubject(notificationEmail.getSubject());
            messageHelper.setText(mailContentBuilder.build(notificationEmail.getBody()));
        };
        try { // Make sure to grab any exceptions and put them into a custom exception class
            //custom classes can be on generic one or multiple different ones for specific use cases
            // do this in order to hide logic that comes from most exception errors.
            mailSender.send(messagePreparator);
            log.info("Activation email sent.");
        } catch (MailException e) {
            throw new ProjectManagementException("Exception occurred when sending mail to ");

        }
    }
}
