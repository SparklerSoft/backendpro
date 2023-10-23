package com.proftelran.org.homework2;

public class RadioPhone extends Phone {

    public RadioPhone(int number, String model, int weight) {
        super(number, model, weight);
    }

    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public String call(int number) {
        return "This phone " + getPhoneName() + " " + ownNumber + super.call(number);
    }

    @Override
    public String receiveCall(int number2) {
        return "This phone " + getPhoneName() + " " + ownNumber + super.receiveCall(number2);
    }
}
