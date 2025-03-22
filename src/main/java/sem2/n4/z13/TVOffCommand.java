package sem2.n4.z13;

public class TVOffCommand implements Command {
    private Tv tv;

    public TVOffCommand(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

}
