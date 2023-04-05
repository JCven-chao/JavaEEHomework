package com.jcven.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    public void before(JoinPoint joinpoint) {
        System.out.print("这是前置通知!");
        System.out.print("目标类是: " + joinpoint.getTarget());
        System.out.println(",被织入增强处理的目标方法为:" + joinpoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint joinpoint) {
        System.out.print("这是返回通知(方法不出现异常时调用)!");
        System.out.println(",被织入增强处理的目标方法为:" + joinpoint.getSignature().getName());
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通时之前的部分!");
        Object object = point.proceed();
        System.out.println("这是环绕通时之后的部分!");
        return object;
    }

    public void afterException() {
        System.out.print("异常通知");
    }

    public void after() {
        System.out.println("这是后置通知!");
    }
}
