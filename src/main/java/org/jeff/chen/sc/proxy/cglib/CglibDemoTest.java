package org.jeff.chen.sc.proxy.cglib;

/**
 * @author jeff
 * <p>Date 2018/5/9 16:11</p>
 */
public class CglibDemoTest {

    public static void main(String[] args) {

        TableDao tableDao = TableDaoFactory.getAuthInstance(new AuthProxy("rose"));
        tableDao.create();
    }
}
