package sem2.n4.z11;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            notifyObservers();
        }
    }

    public void sub(StockObserver observer) {
        observers.add(observer);
    }

    public void unsub(StockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers()
    {
        for (StockObserver observer : observers) {
            observer.update(name,price);
        }
    }
}
