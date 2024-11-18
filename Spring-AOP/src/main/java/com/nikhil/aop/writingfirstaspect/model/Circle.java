package com.nikhil.aop.writingfirstaspect.model;

public class Circle {
    private String name;

    public String getName() {
        System.out.println("Calling getter method of Circle class for setting name.");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Calling setter method of Circle class for setting name.");
        //throw new RuntimeException();
    }

    public void printCircleName(){
        System.out.println("Circle name - "+ name);
//        throw new RuntimeException();
    }

    public String  printAndReturnCircleName(){
        System.out.println("Circle name - "+ name);
        throw new RuntimeException();
        //return name;
    }

    public void printCircleNameForAroundAdvice(){
        System.out.println("Circle name - "+ name);
//        throw new RuntimeException();
    }

    @MyCustomAnnotation
    public void printCircleNameForMyCustomAnnotation(){
        System.out.println("Circle name - "+ name);
//        throw new RuntimeException();
    }

}
