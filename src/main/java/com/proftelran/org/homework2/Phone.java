package com.proftelran.org.homework2;

public class Phone extends com.proftelran.org.homework.Phone {

    public Phone(int number, String model, int weight) {
        super(number, model, weight);
    }

    private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String call(int number) {
        return " try to make a call to number " + number;
    }

    public String receiveCall(int number2) {
        return " try to receive a call from number " + number2;
    }
}
