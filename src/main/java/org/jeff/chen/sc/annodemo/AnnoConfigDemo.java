package org.jeff.chen.sc.annodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @author jeff
 * <p>Date 2018/5/10 11:39</p>
 */
public class AnnoConfigDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-message.xml");
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.sendEmail("known.spammer@example.org", "通知邮件");

    }
}
