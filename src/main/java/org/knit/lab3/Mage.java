package org.knit.lab3;

public class Mage extends Player implements Caster,Movement {
    public Mage(String name) {
        setName(name);
        setDef(0);
        setHealth(100);
        setMana(10);
        setMagicpower(30);
        setMaxHealth(100);
        setStenght(3);
    }

    @Override
    protected void increaseHealth(double value) {
        setHealth(Math.min(getMaxHealth(),getHealth()+value));
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

    public void castspell(Player player) {
        player.decreaseHealth(getMagicpower()+player.getDef());
    }
    public void walk(int x, int y){
        setXcord(x);
        setYcord(y);
    }

}
