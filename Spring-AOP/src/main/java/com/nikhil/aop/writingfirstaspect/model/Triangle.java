package com.nikhil.aop.writingfirstaspect.model;

public class Triangle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printTriangeName(){
        System.out.println("Triangle name - "+name);
        return name;
    }
}
