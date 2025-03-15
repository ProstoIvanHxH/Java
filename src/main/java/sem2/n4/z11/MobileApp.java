package sem2.n4.z11;

public class MobileApp implements StockObserver {
    private String username;

    public MobileApp(String username){
        this.username=username;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(username+", price of "+stockName+" is "+price);
    }
}
