package com.proftelran.org.homework3;

import java.util.Scanner;

import static com.proftelran.org.homework3.Converter.convert;


public class CreditCard{


    private int cardNumber;

    private int cardAmount;

    private static int pincodeCard;

    private String currencyCard;


    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(int cardAmount) {
        this.cardAmount = cardAmount;
    }

//    public static int getPincodeCard() {
//        return pincodeCard;
//    }

    public void setPincodeCard(int pincodeCard) {
        this.pincodeCard = pincodeCard;
    }

    public CreditCard(int cardNumber, int cardAmount, int pincodeCard, String currencyCard) {
        this.cardNumber = cardNumber;
        this.cardAmount = cardAmount;
        this.pincodeCard = pincodeCard;
        this.currencyCard = currencyCard;
    }


    public void checkPinCodeCard(int i, int ii) {

        System.out.println("Input your pincode");
        Scanner scanner = new Scanner(System.in);
        int pincode = scanner.nextInt();
        if (pincodeCard == pincode) {
            System.out.println("Correct PIN");
            {

                System.out.println("Input your amount to withdraw");
                int amountEUR = scanner.nextInt();
                int balanceCard = getCardAmount();
                if (balanceCard >= amountEUR) {
                    System.out.println("Your amount is correct");
                    {

                        int amountUSD = convert(amountEUR);

                        if (amountUSD <= cashWithdraw(amountATM)) {
                            System.out.println("Your amount is correct and it's enough money at the ATM");

                        } else {
                            System.out.println("You want too much, please correct your amount");
                        }
                    }
                } else {
                    System.out.println("Incorrect amount");
                }
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}
