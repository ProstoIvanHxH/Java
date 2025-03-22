package sem2.n4.z13;

public class Main {
    public static void main(String[] args) {
        Light l=new Light();
        Tv sas=new Tv();
        Command switchUp=new TurnOnLightCommand(l);
        Command switchDown=new TurnOffLightCommand(l);
        Command tvon=new TVOnCommand(sas);
        Command tvoff=new TVOffCommand(sas);
        Remote putt=new Remote(tvon,tvoff);

        Remote s=new Remote(switchUp,switchDown);


        s.flipUp();
        putt.flipUp();
        s.flipDown();
        putt.flipDown();
    }

}
