package com.nikhil.aop.writingfirstaspect.service;

import com.nikhil.aop.writingfirstaspect.model.Circle;
import com.nikhil.aop.writingfirstaspect.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
