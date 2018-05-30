package org.jeff.chen.sc.aop;

import org.jeff.chen.sc.aop.service.BusinessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jeff
 * <p>Date 2018/5/30 17:46</p>
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopAppConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopAppConfig.class);
        BusinessService businessService = context.getBean(BusinessService.class);
        businessService.findProductById("苹果");
    }

}
