package org.jeff.chen.sc.annodemo;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:36</p>
 */
public class Service2 {

    private UserDao userDao;

    public Service2(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
