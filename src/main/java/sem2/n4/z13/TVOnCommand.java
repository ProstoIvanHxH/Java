package sem2.n4.z13;

public class TVOnCommand implements Command {
    private Tv tv;

    public TVOnCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }


}
