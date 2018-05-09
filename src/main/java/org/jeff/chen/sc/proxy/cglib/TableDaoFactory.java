package org.jeff.chen.sc.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:09</p>
 */
public class TableDaoFactory {

    public static TableDao getAuthInstance(AuthProxy authProxy){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TableDao.class);
        enhancer.setCallback(authProxy);

        return (TableDao) enhancer.create();
    }
}
