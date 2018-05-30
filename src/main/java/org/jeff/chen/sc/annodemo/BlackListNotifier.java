package org.jeff.chen.sc.annodemo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author jeff
 * <p>Date 2018/5/10 16:20</p>
 * implements ApplicationListener<BlackListEvent>
 */
@Component
public class BlackListNotifier{

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    /*@Override
    public void onApplicationEvent(BlackListEvent event) {
        event.print(notificationAddress);
    }*/
    @EventListener
    public void processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        event.print("");
    }
}
