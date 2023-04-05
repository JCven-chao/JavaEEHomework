package com.jcven.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnoAdvice {
    @Pointcut("execution(* com.jcven.spring.dao.impl.UserDaoImpl.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinpoint) {
        System.out.print("这是前置通知!");
        System.out.print("目标类是: " + joinpoint.getTarget());
        System.out.println(",被织入增强处理的目标方法为:" + joinpoint.getSignature().getName());
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinpoint) {
        System.out.print("这是返回通知(方法不出现异常时调用)!");
        System.out.println(",被织入增强处理的目标方法为:" + joinpoint.getSignature().getName());
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通时之前的部分!");
        Object object = point.proceed();
        System.out.println("这是环绕通时之后的部分!");
        return object;
    }

    @AfterThrowing("pointcut()")
    public void afterException() {
        System.out.print("异常通知");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("这是后置通知!");
    }
}