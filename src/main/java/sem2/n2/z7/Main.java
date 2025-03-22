package sem2.n2.z7;

public class Main {
    public static void main(String[] args) {
        Shop shop=new Shop();

        Produceer produceer=new Produceer(shop);
        Reduceer reduceer= new Reduceer(shop);
        produceer.start();
        reduceer.start();
    }
}
