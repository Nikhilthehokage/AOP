package com.nikhil.aop.writingfirstaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class XMLConfiguredAspect {

    public void advice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("executing before.");
        try {
            proceedingJoinPoint.proceed();
            System.out.println("executing after.");
        }catch (Throwable e) {
            System.out.println("exception thrown in targeted method.");
        }
        System.out.println("executing finally.");
    }
}
