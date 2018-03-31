package com.siwoo.projpa.service;

import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

public interface MailService {


    default MailMessage createMailMessage(String toEmail, String subject, String text) {
        Assert.hasText(toEmail, "mail must not empty string");
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setFrom(getFromEmail());
        mailMessage.setText(text);
        mailMessage.setSubject(subject);
        return mailMessage;
    }

    String getFromEmail();

    void send(MailMessage mailMessage);
}
