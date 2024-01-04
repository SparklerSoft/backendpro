package com.proftelran.org.homework12;

import java.util.*;
import java.util.function.Predicate;

public abstract class SearchEngineApp implements Predicate<Product> {

    public static void main(String[] args) {
        Map<String, Integer> integerProperties = new HashMap<>();
        integerProperties.put("WEIGHT", Integer.valueOf(330));
        integerProperties.put("AMOUNT", Integer.valueOf(10));

        Map<String, String> stringProperties = new HashMap<>();
        stringProperties.put("PACKAGE", "BOX");
        stringProperties.put("MATERIAL", "PAPER");

        Product beer = new Product(11, "Holstein Rose", stringProperties, integerProperties);
        Product water = new Product(12, "Darrell", stringProperties, integerProperties);

        boolean weight = new IntegerPredicate(330, IntegerOperator.EQUAL, "WEIGHT").test(beer);
        System.out.println("The beer in a bottle 330 ml is equal to 330 grams - " + weight);

        IntegerPredicate weightPredicate = new IntegerPredicate(500, IntegerOperator.LESS_OR_EQUAL_THAN, "WEIGHT");
        boolean weightEquals500 = weightPredicate.test(beer);
        System.out.println("The beer in a bottle 330 ml is less or equal to 500 grams - " + weightEquals500);

        IntegerPredicate amount = new IntegerPredicate(50, IntegerOperator.GREATER_THAN, "AMOUNT");
        boolean amountCheck = amount.test(water);
        System.out.println("The water pack contains 10 bottles and it's greater than 50 bottles in the pack - " + amountCheck);

        boolean amount1 = new IntegerPredicate(20, IntegerOperator.LESS_THAN, "AMOUNT").test(beer);
        System.out.println("There are 10 bottles of beer in the box and it's less than 20 bottles in the big box - " + amount1);

        StringPredicate stringPredicate = new StringPredicate("BOX", StringOperator.EQUAL, "PACKAGE");
        boolean packageCheck = stringPredicate.test(beer);
        System.out.println("The beer is packed in the box - " + packageCheck);
    }
}
