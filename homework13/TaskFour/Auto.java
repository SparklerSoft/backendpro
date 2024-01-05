package com.proftelran.org.homework13.TaskFour;

public class Auto {

    private String plates;
    private String color;
    private String brand;
    private int mileage;
    private double price;

    public Auto(String plates, String color, String brand, int mileage, double price) {
        this.plates = plates;
        this.color = color;
        this.brand = brand;
        this.mileage = mileage;
        this.price = price;
    }

    public String getPlates() {
        return plates;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "plates='" + plates + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", mileage='" + mileage + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
