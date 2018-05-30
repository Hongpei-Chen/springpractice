package org.jeff.chen.sc.annodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Properties;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:34</p>
 */
@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public ResourceBundleMessageSource resourceBundleMessageSource(){

        ResourceBundleMessageSource resourceBundleMessageSource =
                new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasenames("exceptions");
        return resourceBundleMessageSource;
    }

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        MessageExample message = context.getBean(MessageExample.class);
        message.execute();
    }
}
