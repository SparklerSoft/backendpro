package com.proftelran.org.homework8;

public class Publisher {

    private String publisherBookName;
    private int yearPublisherOpen;

    public Publisher(String publisherBookName, int yearPublisherOpen) {
        this.publisherBookName = publisherBookName;
        this.yearPublisherOpen = yearPublisherOpen;
    }

    public String getPublisherBookName() {
        return publisherBookName;
    }

    public void setPublisherBookName(String publisherBookName) {
        this.publisherBookName = publisherBookName;
    }

    public int getYearPublisherOpen() {
        return yearPublisherOpen;
    }

    public void setYearPublisherOpen(int yearPublisherOpen) {
        this.yearPublisherOpen = yearPublisherOpen;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherBookName='" + publisherBookName + '\'' +
                ", yearPublisherOpen=" + yearPublisherOpen +
                '}';
    }
}
