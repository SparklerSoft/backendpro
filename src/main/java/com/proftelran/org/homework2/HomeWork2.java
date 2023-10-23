package com.proftelran.org.homework2;

public class HomeWork2 {
    public static void main(String[] args) {

        Phone deviceOne = new Phone(12345, "LG", 144);
        deviceOne.setPhoneName("Fantom");
        System.out.println(deviceOne.call(99003343));
        System.out.println(deviceOne.receiveCall(567483332));
        System.out.println();

        ButtonPhone deviceTwo = new ButtonPhone(345889, "Grandma-phone", 333);
        deviceTwo.setOwnNumber(22334455);
        deviceTwo.setPhoneName("Granny");

        SmartPhone deviceThree = new SmartPhone(78947282, "iPhone 8", 108);
        deviceThree.setOwnNumber(99004627);
        deviceThree.setPhoneName("iPhone Max");

        RadioPhone deviceFour = new RadioPhone(55112, "Motorola 3888", 522);
        deviceFour.setOwnNumber(5001221);
        deviceFour.setPhoneName("Old Phone");

        System.out.println(deviceTwo.call(667543));
        System.out.println(deviceTwo.receiveCall(77778888));
        System.out.println();

        System.out.println(deviceThree.call(911));
        System.out.println(deviceThree.receiveCall(112));
        System.out.println();

        System.out.println(deviceFour.call(7788));
        System.out.println(deviceFour.receiveCall(8877));
        System.out.println();

        Phone[] phones = {deviceOne, deviceTwo, deviceThree, deviceFour};
        makeCall(phones);
        System.out.println();
        receiveCall(phones);
    }

    public static void makeCall(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println(phone.call(1000));
        }
    }

    public static void receiveCall(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println(phone.receiveCall(33333));
        }
    }
}
