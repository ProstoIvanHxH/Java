//package sem2.n2.z5;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Tray {
//    public Queue<String> dishes=new LinkedList<>();
//    private static final int maxDish=3;
//    public synchronized void putDish(String dish) throws InterruptedException{
//        while (dishes.size()>=maxDish){
//            wait();
//        }
//        dishes.add(dish);
//        System.out.println(dish+"coocked");
//        notify();
//    }
//    public synchronized String takeDish{
//
//    }
//}
