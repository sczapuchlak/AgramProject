package com.Stephanie;


public class Card {
    String value;
    String suit;

    final static String Ace = "A";
    final static String King = "K";
    final static String Queen = "Q";
    final static String Jack = "J";

    public Card(String val, String suit) {
        this.value = val;
        this.suit = suit;
    }

    public Card(int val, String suit) {

        this.value = convertNumberToCardVal(val);
        this.suit = suit;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public static String getAce() {
        return Ace;
    }


    public String convertNumberToCardVal(int val) {

        if (val == 1) {
            return Ace;
        } else if (val == 11) {
            return Jack;
        } else if (val == 12) {
            return Queen;
        } else if (val == 13) {
            return King;

        } else {
            return Integer.toString(val);
        }
    }
        @Override
        public String toString() {
            return value +  " of " + suit;
        }


    }

