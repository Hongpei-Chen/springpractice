package org.jeff.chen.xmldemo;

import org.jeff.chen.sc.annodemo.AppConfig;
import org.jeff.chen.sc.annodemo.Service1;
import org.jeff.chen.sc.annodemo.Service2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jeff
 * <p>Date 2018/4/26 16:17</p>
 */
public class AnnnoApplicationTest {


    @Test
    public void testXmlApplication(){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Service1 ser1 = context.getBean(Service1.class);
        Service2 service2 = context.getBean(Service2.class);

        System.out.println(ser1.getUserDao());
        System.out.println(service2.getUserDao());


    }
}
