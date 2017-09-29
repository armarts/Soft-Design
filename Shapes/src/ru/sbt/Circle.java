package ru.sbt;

import java.lang.*;

/**
 * Created by user on 29.09.2017.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
