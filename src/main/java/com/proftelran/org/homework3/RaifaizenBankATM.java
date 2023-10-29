package com.proftelran.org.homework3;

public class RaifaizenBankATM extends ATM{

    private String nameATM;

    private int amountATM;

    private String currency;

    public RaifaizenBankATM(String nameATM, int amountATM, String currency) {
        this.nameATM = nameATM;
        this.amountATM = amountATM;
        this.currency = currency;
    }

    @Override
    public void withdrawCash(int amountATM) {
        super.withdrawCash(amountATM);
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
        return "RaifaizenBankATM{" +
                "nameATM='" + nameATM + '\'' +
                ", amountATM=" + amountATM +
                ", currency='" + currency + '\'' +
                '}';
    }
}
