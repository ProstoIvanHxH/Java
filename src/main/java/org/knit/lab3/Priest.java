package org.knit.lab3;

public class Priest extends Player{
    public Priest(String name){
        setName(name);
        setDef(3);
        setHealth(20);
        setMana(5);
        setMagicpower(20);
        setMax_health(20);
        setStenght(7);

    }
    @Override
    protected double increaseHealth(double value) {
        return 0;
    }

    @Override
    protected void decreaseHealth(double value) {

    }
}
