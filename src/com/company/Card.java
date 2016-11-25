package com.company;


public class Card {
    Suit suit;
    Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() { return value + " of " + suit;}


    public int getScore() { return this.value.score;  }
}
