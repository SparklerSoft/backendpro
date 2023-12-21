package com.proftelran.org.homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import static com.proftelran.org.homework9.Rank.*;
import static com.proftelran.org.homework9.Suits.*;

public class Deal {

    public static void main(String[] args) {
        final Enum[] suits = {CLUBS, SPADES, DIAMONDS, HEARTS};
        final Enum[] rank = {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};

        Stack<String> stringStack = new Stack<>();
        for (Enum suit : suits) {
            for (Enum r : rank) {
                stringStack.push(suit.toString() + " " + r.toString());
            }
        }
        ArrayList<String> deckList = new ArrayList<>(stringStack);
        Collections.shuffle(deckList);
        Stack<String> shuffledDeck = new Stack<>();
        shuffledDeck.addAll(deckList);
        System.out.println(shuffledDeck);

        while (!shuffledDeck.isEmpty() || shuffledDeck.size() > 4) {
            if (shuffledDeck.size() >= 2) {
                String card1 = shuffledDeck.pop();
                String card2 = shuffledDeck.pop();

                String[] card1Parts = card1.split(" ");
                String[] card2Parts = card2.split(" ");

                String suit1 = card1Parts[0];
                String suit2 = card2Parts[0];

                if (suit1.equals(suit2)) {

                    System.out.println("Suits are equal, removing cards: " + card1 + " and " + card2);
                    System.out.println("Cards left " + shuffledDeck.size());

                } else {

                    System.out.println("Suits are not equal");

                    shuffledDeck.push(card2);
                    shuffledDeck.push(card1);
                    Collections.shuffle(shuffledDeck);
                    System.out.println("Deck size is " + shuffledDeck.size());

                }
                if (shuffledDeck.size() == 4) {
                    System.out.println("Game is over! Congrats! Cards left " + shuffledDeck.toString());
                    break;
                }
            } else {
                System.out.println("Not enough cards in the deck to compare");
            }
        }
    }
}

