package com.example.project.basic.basic5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionHandlerAspect {
    @Around("execution(* com.example.project.basic.basic5.*MemberService.*(..))")
    public Object handlerException(ProceedingJoinPoint joinPoint) throws Throwable{
        try {
            return joinPoint.proceed();
        }catch (Exception e){
            System.out.println("예외 발생 위치 :" + joinPoint.getSignature());
            System.out.println("예외 메세지:" + e.getMessage());
            return null;
        }
    }
}
