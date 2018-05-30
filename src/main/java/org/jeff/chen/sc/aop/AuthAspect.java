package org.jeff.chen.sc.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jeff
 * <p>Date 2018/5/30 17:57</p>
 */
@Component
@Aspect
public class AuthAspect {

    @Pointcut("execution(* org.jeff.chen.sc.aop.service.BusinessService.*(..))")
    private void beforePointCut(){};

    @Pointcut("execution(* org.jeff.chen.sc.aop.service.BusinessService.*(..))")
    private void afterPointCut(){};

    @Before("beforePointCut()")
    public void doBefore(){
        System.out.println("=========== Before Advice ================");
    }

    @AfterReturning(pointcut = "afterPointCut()", returning = "retVal")
    public void doAfter(Object retVal){
        String str = (String) retVal;
        System.out.println("============ After Advice ==============" + str);
    }
}
