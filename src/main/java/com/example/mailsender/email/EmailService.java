package com.example.mailsender.email;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(EmailDTO emailDTO) throws MailException {
        var message = new SimpleMailMessage();

        message.setFrom("noreply@email.com");
        message.setTo(emailDTO.to());
        message.setSubject(emailDTO.subject());
        message.setText(emailDTO.body());

        javaMailSender.send(message);
    }
}
