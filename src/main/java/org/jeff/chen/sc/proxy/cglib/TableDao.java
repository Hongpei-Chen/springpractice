package org.jeff.chen.sc.proxy.cglib;

/**
 * @author jeff
 * <p>Date 2018/5/9 15:53</p>
 */
public class TableDao {
    public void create(){
        System.out.println("create() is running !");
    }
    public void query(){
        System.out.println("query() is running !");
    }
    public void update(){
        System.out.println("update() is running !");
    }
    public void delete(){
        System.out.println("delete() is running !");
    }
}