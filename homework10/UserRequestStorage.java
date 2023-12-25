package com.proftelran.org.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRequestStorage {

    private Map<String, List<UserRequest>> storage;

    public UserRequestStorage() {
        this.storage = new HashMap<>();
    }

    public void addRequest(String user, String address, RequestStatus status) {
        UserRequest request = new UserRequest(address, status);
        storage.computeIfAbsent(user, k -> new ArrayList<>()).add(request);
    }

    public void viewUserActions(String user) {
        if (storage.containsKey(user)) {
            System.out.println("User: " + user + " Actions:");
            for (UserRequest request : storage.get(user)) {
                System.out.println("Address: " + request.getAddress() + ", Status: " + request.getStatus());
            }
        } else {
            System.out.println("No actions found for user: " + user);
        }
    }
}
