package sem2.n4.z11;

public class Main {
    public static void main(String[] args) {
        Stock tesla=new Stock("tesla",1000);
        Stock lada=new Stock("lada",10);
        MobileApp cherpoulse=new MobileApp("cherpoulse");
        EmailNotifier horn=new EmailNotifier("horn@gmail.com");
        tesla.sub(cherpoulse);
        tesla.sub(horn);
        lada.sub(cherpoulse);
        tesla.setPrice(0.5);
        lada.setPrice(979854984);
        tesla.unsub(horn);
        tesla.setPrice(999999999);
    }
}
