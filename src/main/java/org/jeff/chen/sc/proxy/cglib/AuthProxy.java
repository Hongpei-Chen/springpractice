package org.jeff.chen.sc.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jeff
 * <p>Date 2018/5/9 15:54</p>
 */
public class AuthProxy implements MethodInterceptor {

    private String name;

    public AuthProxy(String name){
        this.name = name;
    }

    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        if (!"rose".equals(name)){
            System.out.println("你没有权限！");
            return null;
        }
        System.out.println("=====================");
        return methodProxy.invokeSuper(o, objects);
    }
}
