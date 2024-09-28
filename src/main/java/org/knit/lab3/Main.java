package org.knit.lab3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mage sedan = new Mage("Abobus");
        sedan.walk(14,13);
        Warrior ipar = new Warrior("ipar","Guard");
        ipar.walk(10,10);
        Cleric kak =new Cleric("kak");
        kak.walk(20,30);
//        List<Player> playerslist=new ArrayList<>();
//        playerslist.add(kak);
//        playerslist.add(sedan);
//        playerslist.add(ipar);

        System.out.println(sedan.getHealth());
        ipar.hit(sedan);
        ipar.hit(sedan);
        ipar.hit(sedan);
        kak.heal(sedan);
        sedan.castspell(ipar);
        sedan.castspell(ipar);
        sedan.castspell(ipar);
        kak.heal(ipar);
        System.out.println(sedan.getHealth());
        sedan.castspell(ipar);
        System.out.println(ipar.getHealth());

    }
}