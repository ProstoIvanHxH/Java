package org.knit.lab3;

public class Cleric extends Player implements Healer, Movement {
    public Cleric(String name) {
        setName(name);
        setDef(3);
        setHealth(200);
        setMana(5);
        setMagicpower(20);
        setMaxHealth(200);
        setStenght(7);

    }

    @Override
    protected void increaseHealth(double value) {
        setHealth(Math.min(getMaxHealth(), getHealth() + value));
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

    public void heal(Player player) {
        player.increaseHealth(getMagicpower());
    }

    public void walk(int x, int y) {
        setXcord(x);
        setYcord(y);
    }
}
