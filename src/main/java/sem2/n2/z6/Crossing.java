package sem2.n2.z6;

public class Crossing {
    private boolean isTrainPassing = false;

    public synchronized void trainArriving() {
        isTrainPassing = true;
    }

    public synchronized void trainLeaving() {
        isTrainPassing = false;
        notifyAll();
    }

    public synchronized void waitUntilTrainPasses() throws InterruptedException {
        while (isTrainPassing) {
            wait();
        }
    }
}