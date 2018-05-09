package org.jeff.chen.sc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author jeff
 * <p>Date 2018/4/25 17:10</p>
 */
@Controller
public class HelloController {

    final MessageService myService;

    @Autowired
    public HelloController(MessageService myService){
        this.myService = myService;
    }

    public void printMessage(){
        System.out.println(myService.getMessage());
    }

}
