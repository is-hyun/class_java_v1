package com.oop10;

public class CardUser {

    int cardNumber;
    private String name;

    public CardUser(String name) {
        this.name = name;
        this.cardNumber = CardCom.cardSerialNum;
        CardCom.cardSerialNum++;
    }

}
