package com.Stephanie;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Player {
    private String name;
    private Card cardThatWasPlayed;
    private LinkedList<Card> handOfCards;
    private boolean computer;
    private boolean playedTheirTurn;
    private boolean whoWonRound;


    public Player(String name, boolean computer) {
        this.name = name;
        this.computer = computer;
        handOfCards = new LinkedList<Card>();
        whoWonRound = false;
        playedTheirTurn = false;
    }
// GENERATE GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCardThatWasPlayed() {
        return cardThatWasPlayed;
    }

    public void setCardThatWasPlayed(Card cardThatWasPlayed) {
        this.cardThatWasPlayed = cardThatWasPlayed;
    }

    public LinkedList<Card> getHandOfCards() {
        return handOfCards;
    }

    public void setHandOfCards(LinkedList<Card> handOfCards) {
        this.handOfCards = handOfCards;
    }
    public void addToHandOfCards(Card drawnCard){
        handOfCards.push(drawnCard);
    }
    public void removeFromHandOfCards(Card drawnCard){
        handOfCards.remove(drawnCard);
    }
    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }

    public boolean isPlayedTheirTurn() {
        return playedTheirTurn;
    }

    public void setPlayedTheirTurn(boolean playedTheirTurn) {
        this.playedTheirTurn = playedTheirTurn;
    }

    public boolean isWhoWonRound() {
        return whoWonRound;
    }

    public void setWhoWonRound(boolean whoWonRound) {
        this.whoWonRound = whoWonRound;
    }
//    public int suitCardsInHand(String suit){
//int cards = 0;
  //      for (Card c : hand){
    //    if (suit.equalsIgnoreCase(c.getSuit())){
      //      cards++;
        //}
 //   }//
//return cards;
}