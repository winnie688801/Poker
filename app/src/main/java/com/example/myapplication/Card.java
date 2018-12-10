package com.example.myapplication;

public class Card {
    char[] suits = {'C' , 'D' , 'H' , 'S'};
    int value;
    public Card(int value){
        this.value = value;
    }

    public String get(){
        return value%13+1 + "" + suits[value/13];
    }
}
