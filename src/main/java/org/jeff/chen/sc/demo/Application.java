package org.jeff.chen.sc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jeff
 * <p>Date 2018/4/25 17:13</p>
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService(){
        return () -> "mock 测试";
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        HelloController hc = context.getBean(HelloController.class);
       hc.printMessage();
    }
}
