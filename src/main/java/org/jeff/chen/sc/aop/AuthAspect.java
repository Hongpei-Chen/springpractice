package org.jeff.chen.sc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author jeff
 * <p>Date 2018/5/30 17:57</p>
 */
@Component
@Aspect
public class AuthAspect {

    @Pointcut("execution(* org.jeff.chen.sc.aop.service.BusinessService.*(..))")
    private void pointcut(){};


    @Before("pointcut()")
    public void doBefore(){
        System.out.println("=========== Before Advice ================");
    }

    @AfterReturning(pointcut = "pointcut()", returning = "retVal")
    public void doAfter(Object retVal){
        String str = (String) retVal;
        System.out.println("============ After Advice ==============");
        System.out.println(str + "添加辣椒");
    }

    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("================= Around Before =====================");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕通知的返回值：" + (String) proceed);
        System.out.println("================= Around After ======================");
        return proceed;
    }


}
