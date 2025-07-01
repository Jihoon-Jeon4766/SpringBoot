package com.example.project.basic.basic4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Aspect
@Component
public class SampleAspect {

//    @Before("execution(* com.example.project.basic.basic3.*Greet.*(..))")
//    public void beforeAdvice(JoinPoint joinPoint){
//        System.out.println("======== Before Advice =========");
//
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
//        System.out.println(String.format("메서드: %s", joinPoint.getSignature().getName()));
//    }

//    @After("execution(* com.example.project.basic.basic3.*Greet.*(..))")
//    public void afterAdvice(JoinPoint joinPoint){
//        System.out.println("======== After Advice ========");
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
//        System.out.println(String.format("메서드 : %s", joinPoint.getSignature().getName()));
//    }

//    @Around("execution(* com.example.project.basic.basic3.*Greet.*(..))")
//    public Object arroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
//        System.out.println("======== Around Advice ========");
//        System.out.println("🔽🔽처리전🔽🔽");
//        Object result = joinPoint.proceed();
//        System.out.println("🔼🔼처리후🔼🔼");
//
//        return result;
//    }


}
