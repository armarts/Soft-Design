package ru.sbt;

/**
 * Created by user on 29.09.2017.
 */
public class Square extends Shape {

    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        return size * size;
    }
}

