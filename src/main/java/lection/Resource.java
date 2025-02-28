package lection;

public class Resource {
    private int count=0;
    public synchronized void increment(){
        count++;
    }
}
