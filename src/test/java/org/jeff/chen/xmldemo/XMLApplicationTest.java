package org.jeff.chen.xmldemo;

import org.jeff.chen.sc.xmldemo.BeanComponet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jeff
 * <p>Date 2018/4/26 16:17</p>
 */
public class XMLApplicationTest {

    @Test
    public void testXmlApplication(){

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        BeanComponet beanComponent = (BeanComponet) context.getBean("beanComponent");
        System.out.println(beanComponent.getI());

    }
}
