package org.jeff.chen.sc.annodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:34</p>
 */
@Configuration
@ComponentScan
public class AppConfig {

    private UserDao userDao;

    @Autowired
    public AppConfig(UserDao userDao){
        this.userDao = userDao;
    }

    @Bean
    public Service1 service1(UserDao userDao){
        return new Service1(userDao);
    }

    @Bean
    public Service2 service2(UserDao userDao){
        return new Service2(userDao);
    }

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }


}
