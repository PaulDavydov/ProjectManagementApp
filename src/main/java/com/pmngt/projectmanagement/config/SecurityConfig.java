package com.pmngt.projectmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity // enables web security module
public class SecurityConfig extends WebSecurityConfigurerAdapter { // extension provides default security configs

    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable() // allow for reuqests which match the endpoint /api/auth/**
                .authorizeRequests()
                .antMatchers("/api/auth/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @Bean
    PasswordEncoder passwordEncoder() { // storing passwords in a database, want to encode it somehow
        return new BCryptPasswordEncoder();
    }
}
