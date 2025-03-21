package sem2.n2.z8;

import sem2.n2.z6.Crossing;

public class Car implements Runnable {
    private String name;
    private Road road;

    public Car(String name, Road road) {
        this.name = name;
        this.road=road;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(name + " waits");
                road.traffic();
                System.out.println(name + ": passed light");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}