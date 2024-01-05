package com.proftelran.org.homework13.TaskThree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaskThreeApp {

    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();
        List<Phone> phoneList = new ArrayList<>();

        Client alex = new Client(11, "Alex", 35, phoneList);
        Client maxim = new Client(12, "Maxim", 39, phoneList);
        Client vartan = new Client(15, "Vartan", 27, phoneList);
        Client zaddar = new Client(34, "Zaddar", 20, phoneList);
        Client pavel = new Client(3, "Pavel", 49, phoneList);

        clientList.add(alex);
        clientList.add(maxim);
        clientList.add(vartan);
        clientList.add(zaddar);
        clientList.add(pavel);

        Phone phone = new Phone("344322222", PhoneType.MOBILE);
        Phone phone1 = new Phone("321112333", PhoneType.LANDLINE);
        Phone phone2 = new Phone("654322", PhoneType.MOBILE);
        Phone phone3 = new Phone("4757488383", PhoneType.MOBILE);
        Phone phone4 = new Phone("300302928", PhoneType.LANDLINE);

        phoneList.add(phone);
        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);
        phoneList.add(phone4);


        Optional<Client> oldestWithLandline = clientList.stream()
                .filter(client -> client.getPhoneNumbers().stream()
                        .anyMatch(ph -> ph.getType() == PhoneType.LANDLINE))
                .max(Comparator.comparingInt(Client::getAge));

        oldestWithLandline.ifPresent(client -> {
            System.out.println("Oldest client using a landline phone:");
            System.out.println("Name: " + client.getName());
            System.out.println("Age: " + client.getAge());
        });
    }
}
