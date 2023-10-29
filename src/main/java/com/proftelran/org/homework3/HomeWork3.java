package com.proftelran.org.homework3;




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
        santanderBankATM.withdrawCash(santanderBankATM.getAmountATM());
        santanderBankATM.getAmountATM();



        ATM[] atms = {santanderBankATM, nationalBank, raifaizenBankATM, polandBankATM};
        for (ATM atm : atms) {
            if (atm instanceof Converter) {
                System.out.println("You can convert your EUR to USD here " + atm.toString(santanderBankATM)); // I couldn't find a command to get a name
            }
        }
        System.out.println();

        creditCard.checkPinCodeCard(5000, 24000);
        santanderBankATM.checkPinCode();
        System.out.println("pause");
        //santanderBankATM.converter();


    }
}

