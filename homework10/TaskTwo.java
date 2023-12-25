package com.proftelran.org.homework10;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        UserRequestStorage requestStorage = new UserRequestStorage();


        String[] initialData = {
                "User1;www.de.de;APPROVED",
                "User2;www.ebay.de;DENIED",
                "User2;www.amazon.de;DENIED",
                "User1;www.ebay.blabla;ERROR"
        };

        for (String data : initialData) {
            String[] parts = data.split(";");
            String user = parts[0];
            String address = parts[1];
            RequestStatus status = RequestStatus.valueOf(parts[2]);
            requestStorage.addRequest(user, address, status);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user to view actions:");
        String userInput = scanner.nextLine();
        requestStorage.viewUserActions(userInput);
    }
}
