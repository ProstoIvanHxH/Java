package lection;

public class MySingle {
    private static volatile MySingle instance; 

    private MySingle() {

    }

    public static MySingle getInstance() {
        if (instance == null) {
            synchronized (Object.class) {
                if (instance == null) {
                    instance = new MySingle();
                }
            }
        }
        return instance;
    }

    public void printMes(String string) {
        System.out.println(string);
    }
}
