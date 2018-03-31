package com.siwoo.projpa.test;

import com.siwoo.projpa.service.MailService;
import org.springframework.mail.MailException;
import org.springframework.mail.MailMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MockMailSender implements MailService{


    @Override
    public String getFromEmail() {
        return null;
    }

    @Override
    public void send(MailMessage mailMessage) {
        /*  ignore  */
    }
}
