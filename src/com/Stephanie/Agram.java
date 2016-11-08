package com.Stephanie;
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;
//this program is designed to play the card game agram.
public class Agram {
    static Scanner stringScanner= new Scanner(System.in);
    static Card cardsWereUsing;
    static Deck agramDeckWereUsing;
    static Random randomGenerator;

    public static void main(String[] args) {
   //create players
    int numberOfPlayers= 4;
        //create deck to use
        agramDeckWereUsing= new Deck();
        agramDeckWereUsing.agramDeck();
        Player[] players = new Player[numberOfPlayers];

        for (int x = 0;x<numberOfPlayers;x++){
            if(x == 0 ) {
                players[x] = new Player("Player 1", false);
            }else{
                players[x]= new Player("Computer"+ x, true);
            }
        }
        //deal 6 cards out to players
        for (int y = 0; y<6;y++){
            for (Player player: players)
                player.addToHandOfCards(agramDeckWereUsing.drawCard());
        }


    }




}
