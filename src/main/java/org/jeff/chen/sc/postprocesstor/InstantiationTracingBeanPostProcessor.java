package org.jeff.chen.sc.postprocesstor;

import org.jeff.chen.sc.xmldemo.BeanComponet;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.time.ZonedDateTime;

/**
 * @author jeff
 * <p>Date 2018/4/28 17:46</p>
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor{

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("============bean 实例化前 ===========================");
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=========" + beanName + ":" + bean.toString());
        if (bean instanceof BeanComponet){
            BeanComponet bc = (BeanComponet) bean;
            bc.setIntegerI(40);
        }
        return bean;
    }
}
