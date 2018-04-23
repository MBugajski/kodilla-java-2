package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double baseLength;
    double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public Double getField() {
        return (baseLength * height) /2;
    }
}
