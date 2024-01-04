package com.proftelran.org.homework12;

import java.util.Map;

public class Product {

    private int id;

    private String name;

    // color -> Red
    // flavour -> Apple

    private Map<String , String > stringProperties;
    private Map<String, Integer> integerProperties;

    public Product(int id, String name, Map<String, String> stringProperties, Map<String, Integer> integerProperties) {
        this.id = id;
        this.name = name;
        this.stringProperties = stringProperties;
        this.integerProperties = integerProperties;
    }

    public Map<String, Integer> getIntegerProperties() {
        return integerProperties;
    }

    public Map<String, String> getStringProperties() {
        return stringProperties;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stringProperties=" + stringProperties +
                ", integerProperties=" + integerProperties +
                '}';
    }
}
