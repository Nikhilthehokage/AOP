package com.nikhil.aop.writingfirstaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    /* Note - If execution(public String getName() is provided without class name it will execute for all classes which has this method.
    *       wildcard -  * get*() - method starting with get and has zero arguments
    *                   * get*(*) - method starting with get and has n arguments where n>0
    *                   * get*(..) - method starting with get and has n arguments where n>=0
     * */

    //@Before("execution(public String com.nikhil.aop.writingfirstaspect.model.Circle.getName())")
    /* To avoid redundancy in expressions point cuts are introduced*/
    @Before("allGetters()")
    public void loggingAdvice(){
        System.out.println("Advice run, advice one  executed successfully");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Advice run, advice two executed successfully");
    }

    @Pointcut("execution(public String com.nikhil.aop.writingfirstaspect.model.Circle.getName())")
    public void allGetters(){

    }


}
