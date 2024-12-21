package org.knit.lab2.n4;

public class Cube extends Shape {
    private double side;

    public Cube(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительным числом.");
        }
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

}