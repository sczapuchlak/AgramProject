package com.Stephanie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    ArrayList<Card> cards;

    final static String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};

    final static String[] values = { Card.Ace, "3", "4", "5", "6", "7", "8", "9","10",Card.Jack,Card.Queen,Card.King};

    static LinkedList<Card> deck = new LinkedList<Card>();


    public Deck() {

        for (String suit:suits) {

            for (String value : values) {
                deck.add(new Card(suit,value));
            }
        }
//shuffle the cards
        Collections.shuffle(cards);
    }
    public void agramDeck(){
        deck.removeIf(card -> card.getValue()=="2");
        deck.removeIf(card ->card.getValue()=="11");
        deck.removeIf(card ->card.getValue()=="12");
        deck.removeIf(card ->card.getValue()=="13");
        deck.removeIf(card ->card.toString().equals("Ace of Spades"));

  Collections.shuffle(deck);
    }
public void drawCard(LinkedList<Card>handOfCards) {
    handOfCards.push(deck.pop());
}
public Card drawCard() {
    return deck.pop();
}

    public int cardsLeft() {
        return cards.size();
    }
}

