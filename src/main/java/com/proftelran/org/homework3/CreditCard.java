package com.proftelran.org.homework3;

import java.util.Scanner;

import static com.proftelran.org.homework3.Converter.convert;


public class CreditCard{

    private int cardNumber;

    private static int cardAmount;

    private static int pincodeCard;

    private String currencyCard;

    public static int getCardAmount() {
        return cardAmount;
    }

    public static int getPincodeCard() {
        return pincodeCard;
    }

    public void setCardAmount(int cardAmount) {
        this.cardAmount = cardAmount;
    }

    public void setPincodeCard(int pincodeCard) {
        this.pincodeCard = pincodeCard;
    }

    public CreditCard(int cardNumber, int cardAmount, int pincodeCard, String currencyCard) {
        this.cardNumber = cardNumber;
        this.cardAmount = cardAmount;
        this.pincodeCard = pincodeCard;
        this.currencyCard = currencyCard;
    }
}
