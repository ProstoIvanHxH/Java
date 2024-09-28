package org.knit.lab3;

public abstract class Player {
    private double health;
    private String name;
    private double mana;
    private double max_health;
    private boolean isAlive = true;
    private int xcord;
    private int ycord;
    private int def;
    private int stenght;
    private int magicpower;

    public int getStenght() {
        return stenght;
    }

    public void setStenght(int stenght) {
        this.stenght = stenght;
    }

    public int getMagicpower() {
        return magicpower;
    }

    public void setMagicpower(int magicpower) {
        this.magicpower = magicpower;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getYcord() {
        return ycord;
    }

    public void setYcord(int ycord) {
        this.ycord = ycord;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getMax_health() {
        return max_health;
    }

    public void setMax_health(double max_health) {
        this.max_health = max_health;
    }

    public int getXcord() {
        return xcord;
    }

    public void setXcord(int xcord) {
        this.xcord = xcord;
    }
    protected abstract double increaseHealth(double value);
    protected abstract void decreaseHealth(double value);
}