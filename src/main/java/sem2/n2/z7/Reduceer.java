package sem2.n2.z7;

import sem2.n2.z5.Tray;

import java.util.concurrent.ThreadLocalRandom;

public class Reduceer extends Thread {
    private Shop shop;

    public Reduceer(Shop shop) {
        this.shop=shop;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                shop.buyItem();
                Thread.sleep(ThreadLocalRandom.current().nextInt(100,5000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}