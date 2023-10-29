package com.proftelran.org.homework3;


import java.util.Scanner;

import static com.proftelran.org.homework3.Converter.convert;


public class HomeWork3 {
    public static void main(String[] args) {

        SantanderBankATM santanderBankATM = new SantanderBankATM("ATM-number1", 24000, "USD");
        NationalBank nationalBank = new NationalBank("ATM-national2", 3000, "USD");
        RaifaizenBankATM raifaizenBankATM = new RaifaizenBankATM("RaifATM-3", 30000, "USD");
        PolandBankATM polandBankATM = new PolandBankATM("PolandATM-4", 50000, "USD");

        CreditCard creditCard = new CreditCard(22334455, 5000, 2589, "EUR");
        creditCard.setCardAmount(5000);
        creditCard.setPincodeCard(2589);
        santanderBankATM.setAmountATM(24000);
//        santanderBankATM.withdrawCash(santanderBankATM.getAmountATM());
//        santanderBankATM.getAmountATM();

        System.out.println("Let's check where you could to convert your EUR to USD");
        System.out.println();
        ATM[] atms = {santanderBankATM, nationalBank, raifaizenBankATM, polandBankATM};
        for (ATM atm : atms) {
            if (atm instanceof Converter) {
                System.out.println("You can convert your EUR to USD here: " + atm.toString(santanderBankATM));
            }
        }
        System.out.println();

        checkPinCodeCard();


    }

    private static void checkPinCodeCard() {
        System.out.println("Input your pincode");
        Scanner scanner = new Scanner(System.in);
        int pincode = scanner.nextInt();
        if (CreditCard.getPincodeCard() == pincode) {
            System.out.println("Correct PIN");
            {

                System.out.println("Input your amount to withdraw");
                int amountEUR = scanner.nextInt();
                int balanceCard = CreditCard.getCardAmount();
                if (balanceCard >= amountEUR) {
                    System.out.println("Your amount is correct");
                    {

                        int amountUSD = convert(amountEUR);
                        int balance = SantanderBankATM.getAmountATM();
                        if (amountUSD <= balance) {
                            System.out.println("Your amount is correct, take your cash");
                            System.out.println("Your new card balance is " + (balanceCard-amountEUR) + " EUR");
                            System.out.println("The new ATM balance is " + (balance-amountUSD) + " USD");

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

