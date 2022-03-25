package com.pmngt.projectmanagement.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
class MailContentBuilder { // contains logic to build emails using the HTML template
    private final TemplateEngine templateEngine;

    String build(String message) { // builds email using Thymeleaf template engine
        Context context = new Context();
        context.setVariable("message", message); // adds message string to the Context of the TemplateEngine
        return templateEngine.process("mailTemplate", context);
    }
}
