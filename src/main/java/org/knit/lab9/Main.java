package org.knit.lab9;

import java.util.ArrayList;
import java.util.List;

enum Suit {
    ПИКИ("Пики"),
    ЧЕРВИ("Черви"),
    БУБНЫ("Бубны"),
    ТРЕФЫ("Трефы");

    private final String displayName;

    Suit(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

enum Rank {
    ДВА("2"),
    ТРИ("3"),
    ЧЕТЫРЕ("4"),
    ПЯТЬ("5"),
    ШЕСТЬ("6"),
    СЕМЬ("7"),
    ВОСЕМЬ("8"),
    ДЕВЯТЬ("9"),
    ДЕСЯТЬ("10"),
    ВАЛЕТ("Валет"),
    ДАМА("Дама"),
    КОРОЛЬ("Король"),
    ТУЗ("Туз");

    private final String displayName;

    Rank(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}

class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getRank(){
        return rank;
    }

    @Override
    public String toString(){
        return rank + " " + suit;
    }
}


public class Main {
    public static void main(String[] args){

        List<Card> deck = new ArrayList<>();

        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                deck.add(new Card(suit, rank));
            }
        }

        System.out.println("Стандартная колода из 52 карт:");
        for(Card card : deck){
            System.out.println(card);
        }
    }
}