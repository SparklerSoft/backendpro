package com.proftelran.org.homework10;

public class UserRequest {

    private String address;
    private RequestStatus status;

    public UserRequest(String address, RequestStatus status) {
        this.address = address;
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public RequestStatus getStatus() {
        return status;
    }
}
