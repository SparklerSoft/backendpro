package com.proftelran.org.homework3;

import com.proftelran.org.homework3.CreditCard;

public interface Converter {

    void converter();



    static int convert(int amountEUR) {
        int amountUSD = (int) (amountEUR * 1.2);
        System.out.println("Your converted amount is " + amountUSD + " USD");
        return (amountUSD);
    }
}

