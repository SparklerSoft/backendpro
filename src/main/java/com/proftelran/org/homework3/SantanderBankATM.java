package com.proftelran.org.homework3;

public class SantanderBankATM extends ATM implements Converter{

    private String nameATM;

    private static int amountATM;

    private String currency;

    public SantanderBankATM(String nameATM, int amountATM, String currency) {
        this.nameATM = nameATM;
        this.amountATM = amountATM;
        this.currency = currency;
    }

    public static int getAmountATM() {
        return amountATM;
    }

    public void setAmountATM(int amountATM) {
        this.amountATM = amountATM;
    }

    @Override
    public int withdrawCash(int amountATM) {
        return this.amountATM + getAmountATM()+super.withdrawCash(amountATM);
    }

    @Override
    public void inputCash() {
        super.inputCash();
    }

    @Override
    public void checkPinCode() {
        super.checkPinCode();
    }

    @Override
    public String toString(SantanderBankATM santanderBankATM) {
        return "SantanderBankATM: " + nameATM ;
    }

    @Override
    public void converter() {
    }




    }

