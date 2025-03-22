package sem2.n4.z13;

public class Remote {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Remote(Command flipUpCommand,Command flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}
