package com.nikhil.aop.writingfirstaspect;

import com.nikhil.aop.writingfirstaspect.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String [] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("new name");
        //System.out.println(shapeService.getCircle().getName());
        //shapeService.getCircle().printCircleName();
        //shapeService.getCircle().printAndReturnCircleName();
        shapeService.getCircle().printCircleNameForAroundAdvice();

    }
}
