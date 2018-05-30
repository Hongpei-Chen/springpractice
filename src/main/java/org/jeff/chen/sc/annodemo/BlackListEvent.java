package org.jeff.chen.sc.annodemo;

import org.springframework.context.ApplicationEvent;

/**
 * @author jeff
 * <p>Date 2018/5/10 16:13</p>
 */
public class BlackListEvent extends ApplicationEvent {

    private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

    public void print(String notifier){
        System.out.println(notifier + "已被添加到黑名单");
    }
}
