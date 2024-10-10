package com.ilyanders.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        Object targetMethodResult;

        try {
            targetMethodResult = joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturningBookLoggingAdvice: было поймано исключение " + e);

            throw e;
        }

        System.out.println("aroundReturningBookLoggingAdvice: в библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
