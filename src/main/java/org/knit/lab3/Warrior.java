package org.knit.lab3;

public class Warrior extends Player implements Melee, Movement {
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    private int range;
    public Warrior(String name, String subclass) {
        setName(name);
        if (subclass == "Guard") {
            setRange(5);
            setDef(7);
            setStenght(8);
        } else {
            setDef(5);
            setRange(8);
            setStenght(10);
        }
        setHealth(300);
        setMana(2);
        setMagicpower(10);
        setMaxHealth(300);


    }

    @Override
    protected void increaseHealth(double value) {
        setHealth(Math.min(getMaxHealth(), getHealth() + value*1.2));
    }

    @Override
    protected void decreaseHealth(double value) {
        if (getHealth() - value + getDef()*1.1 <= 0) {
            setHealth(0);
            setAlive(false);
        } else {
            setHealth(Math.min(getHealth(), getHealth() + getDef() - value));
        }
    }

    public void hit(Player player) {
        if ((Math.sqrt(Math.pow(getXcord() - player.getXcord(), 2) + Math.pow(getYcord() - player.getYcord(), 2))) <= 5) {
            player.decreaseHealth(getStenght());
        } else {
            System.out.println("too far"+Math.sqrt(Math.pow(getXcord() - player.getXcord(), 2) + Math.pow(getYcord() - player.getYcord(), 2)));
        }
    }

    public void walk(int x, int y) {
        setXcord(x);
        setYcord(y);
    }

}
