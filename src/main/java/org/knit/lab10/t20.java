package org.knit.lab10;

import java.util.ArrayList;
import java.util.List;

class Box<T extends Number> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public double sum() {
        double total = 0.0;
        for (T item : items) {
            total += item.doubleValue();
        }
        return total;
    }

}

public class t20 {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        System.out.println(integerBox.sum());

        Box<Double> doubleBox = new Box<>();
        doubleBox.add(1.5);
        doubleBox.add(2.5);
        System.out.println(doubleBox.sum());
    }
}