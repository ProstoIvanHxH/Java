package org.knit.lab2.n4;

public class Cylinder extends Shape {
    private double radius;
    private double height;


    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Радиус и высота должны быть положительными числами.");
        }
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
