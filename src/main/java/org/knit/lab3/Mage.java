package org.knit.lab3;

public class Mage extends Player {
    public Mage(String name) {
        setName(name);
        setDef(0);
        setHealth(10);
        setMana(10);
        setMagicpower(30);
        setMax_health(10);
        setStenght(3);
    }

    @Override
    protected double increaseHealth(double value) {
        return Math.min(getMax_health(), getHealth() + value);
    }

    @Override
    protected void decreaseHealth(double value) {
        if (getHealth() - value + getDef() <= 0) {
            setHealth(0);
            setAlive(false);
        } else {
            setHealth(Math.min(getHealth(), getHealth() + getDef() - value));
        }
    }
}
