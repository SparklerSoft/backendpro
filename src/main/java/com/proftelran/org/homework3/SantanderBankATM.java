package com.proftelran.org.homework3;

public class SantanderBankATM extends ATM implements Converter, CashWithdraw{

    private String nameATM;

    private int amountATM;

    private String currency;

    public SantanderBankATM(String nameATM, int amountATM, String currency) {
        this.nameATM = nameATM;
        this.amountATM = amountATM;
        this.currency = currency;
    }

    public int getAmountATM() {
        return amountATM;
    }

    public void setAmountATM(int amountATM) {
        this.amountATM = amountATM;
    }

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
        return "SantanderBankATM: " + nameATM ;
    }

    @Override
    public void converter() {

    }


    @Override
    public void cashWithdraw() {
        int amountATM1 = this.amountATM;

    }
}
