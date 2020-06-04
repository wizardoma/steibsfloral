package com.techbek.steibsfloral.service;

import com.techbek.steibsfloral.domain.ContactDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailSender {
    final JavaMailSender mailSender;
    public final String companyEmail = "alibeksaon@gmail.com";
    public void sendContactForm(ContactDto contactDto){
        String subject = contactDto.getSubject() + " Steibs Contact Form";
        String body = "<div><h1>"+ contactDto.getSubject()+"</h1>"+"<p>From: "+contactDto.getName()+"  "+ contactDto.getEmail() + "" +
                "<p>"+ contactDto.getMessage()+ "</p></div>";
        String email = companyEmail;
        sendMail(email, subject,body);
    }


    private void sendMail(String email, String subject, String body){
        log.info("Trying to send Email Address for subject "+subject);
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        try {
            helper.setTo(email);
            helper.setFrom(new InternetAddress(companyEmail));
            helper.setSubject(subject);
            helper.setText(body, true);
            mailSender.send(mimeMessage);
        }
        catch (MessagingException e){
            e.printStackTrace();
        }
        log.info("Email sent");

    }
}
