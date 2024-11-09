package com.nikhil.aop.writingfirstaspect.aspect;

import com.nikhil.aop.writingfirstaspect.model.Circle;
import org.aspectj.lang.JoinPoint;
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
//    @Before("allGetters()")
    /*
        Note - Logical operators work on pointcuts
        Below pointcuts combination represents pointcut expression for all getters in Circle class
     */
    @Before("allGetters() && allCircleMethods()")
    public void loggingAdvice(){
        System.out.println("Advice run, advice one  executed successfully");
    }

    @Before("allGetters()")
    public void secondAdvice(){
        System.out.println("Advice run, advice two executed successfully");
    }

    //@Pointcut("execution(public String com.nikhil.aop.writingfirstaspect.model.Circle.getName())")
    @Pointcut("execution(* get*(..))")
    public void allGetters(){

    }

    /*
        Note -  Pointcut for all methods in classes present in model package - within(com.nikhil.aop.writingfirstaspect.model.*)
                Pointcut for all methods in classes present in model package and sub packages - within(com.nikhil.aop.writingfirstaspect.model..*)
     */
    //Pointcut for all methods in Circle class
    @Pointcut("within(com.nikhil.aop.writingfirstaspect.model.Circle)")
    public void allCircleMethods(){

    }

    /*
        Jointpoint contains data of the method for which advice is running
     */
    @Before("allCircleMethods()")
    public void jointPointAdvice(JoinPoint joinPoint){
        System.out.println("Method data from this addvice was called " +joinPoint.toString());
        System.out.println("Name field value of the target class "+ ((Circle)joinPoint.getTarget()).getName());
    }

    /*
        args() method example
     */
    @Before("args(name)")
    public void argsAdvice(String  name){
        System.out.println("value of the argument passed to the target method "+ name);
    }






}
