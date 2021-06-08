package com.yang;

import com.yang.Mail.sendMail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Springboot05AsyncApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("我是汤圆！");
        message.setText("爱你呦！");

        message.setTo("277295496@qq.com");
        message.setFrom("277295496@qq.com");
        mailSender.send(message);
    }

    @Autowired
    sendMail sendMail;

    @Test
    void contextLoads02() {
        sendMail.setMailSender();
    }


}
