package org.jeff.chen.sc.annodemo;

import org.springframework.context.MessageSource;

/**
 * @author jeff
 * <p>Date 2018/5/10 11:32</p>
 */
public class MessageExample {

    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void execute() {
        String message = messageSource.getMessage("argument.required",
                new Object [] {"userDao"}, "Required", null);
        System.out.println(message);
    }
}
