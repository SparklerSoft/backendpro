package com.proftelran.org.homework;

import static java.nio.file.Files.move;

public class HomeWork1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Freddy");
        person1.setFullName("Black");
        person1.setAge(44);
        Person person2 = new Person("Bobby", "Green", 33);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.getName() + " " + person1.getFullName() + " " + person1.movePerson());
        System.out.println(person2.getName() + " " + person2.getFullName() + " " + person2.talkPerson());
        System.out.println();

        Phone samsung = new Phone(8899, "Samsung Galaxy E22", 133);
        Phone motorola = new Phone(334572, "Motorola Razr V5", 151);
        Phone xiaomi = new Phone(231394, "Xiaomi Flipper", 188);
        System.out.println(samsung.getModel()+" has weight "+samsung.getWeight() + " grams");
        System.out.println(motorola.getModel()+" has number "+motorola.getNumber());
        System.out.println(xiaomi.getModel()+" has weight "+xiaomi.getWeight() + " grams, and has a number "+xiaomi.getNumber());
        System.out.println();
        System.out.println(xiaomi.receiveCall("Dana"));
        System.out.println(xiaomi.receiveCall("Dana")+ " number is " + xiaomi.getTheNumber(576889));
    }
}
