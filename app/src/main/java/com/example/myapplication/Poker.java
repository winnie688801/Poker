package com.example.myapplication;

public class Poker {
    Card[] cards = new Card[52];
    public Poker(){
        for (int i=0; i<52; i++){
            cards[i] = new Card(i);
        }
    }

}
