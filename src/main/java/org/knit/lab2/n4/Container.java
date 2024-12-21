package org.knit.lab2.n4;

import java.util.ArrayList;
import java.util.List;

public class Container extends Shape {
    private double totalVolume;
    private double remainingVolume;
    private List<Shape> shapes;


    public Container(double totalVolume) {
        if (totalVolume <= 0) {
            throw new IllegalArgumentException("Объем контейнера должен быть положительным числом.");
        }
        this.totalVolume = totalVolume;
        this.remainingVolume = totalVolume;
        this.shapes = new ArrayList<>();
    }


    public boolean add(Shape shape) {
        double shapeVolume = shape.getVolume();
        if (shapeVolume <= remainingVolume) {
            shapes.add(shape);
            remainingVolume -= shapeVolume;
            System.out.println(shape + " добавлена в контейнер. Остаток объема: " + remainingVolume);
            return true;
        } else {
            System.out.println("Невозможно добавить " + shape + ". Недостаточно места в контейнере.");
            return false;
        }
    }




    @Override
    public double getVolume() {
        return totalVolume;
    }


    public double getRemainingVolume() {
        return remainingVolume;
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }


}