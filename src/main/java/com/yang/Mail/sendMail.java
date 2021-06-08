package com.yang.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYuan
 * @create 2021--06--08--16:18
 * @description
 */

@RestController
public class sendMail {

    @Autowired
    JavaMailSenderImpl mailSender;

    @GetMapping("/mail")
    public String setMailSender(){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("我是汤圆！");
        message.setText("爱你呦！");

        message.setTo("592548358@qq.com");
        message.setFrom("277295496@qq.com");
        mailSender.send(message);
        return "ok";
    }

}
