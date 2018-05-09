package org.jeff.chen.sc.annodemo;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:34</p>
 */
public class Service1 {

    private UserDao userDao;

    public Service1(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
