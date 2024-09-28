package org.knit.lab3;

public class Warrior extends Player{
    public Warrior(String name){
        setName(name);
        setDef(5);
        setHealth(30);
        setMana(2);
        setMagicpower(10);
        setMax_health(30);
        setStenght(10);

    }
    @Override
    protected double increaseHealth(double value) {
        return 0;
    }

    @Override
    protected void decreaseHealth(double value) {

    }
}
