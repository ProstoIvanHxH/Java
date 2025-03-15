package sem2.n4.z11;

public class EmailNotifier implements StockObserver{
    private String email;
    public EmailNotifier(String email){
        this.email=email;
    }
    @Override
    public void update(String stockName, double price) {
        System.out.println(email+", price of "+stockName+" is "+price);
    }
}
