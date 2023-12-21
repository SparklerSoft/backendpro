package com.proftelran.org.homework9;

public class Card {

    Suits suit;
    Rank rank;

    private static Card[] cards;

    public Card(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
