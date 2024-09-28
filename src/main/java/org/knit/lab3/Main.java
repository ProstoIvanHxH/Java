package org.knit.lab3;

public class Main {

    public static void main(String[] args) {

        Mage sedan = new Mage("Abobus");
        Warrior ipar = new Warrior("ipar");
        System.out.println(sedan.getHealth());
        sedan.decreaseHealth(1);
        System.out.println(sedan.getHealth());
    }
}