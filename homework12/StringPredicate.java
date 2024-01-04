package com.proftelran.org.homework12;

import java.util.Map;
import java.util.function.Predicate;

public class StringPredicate implements Predicate<Product> {

    private String reference;
    private StringOperator stringOperator;
    private String propertyStringName;

    public StringPredicate(String reference, StringOperator stringOperator, String propertyStringName) {
        this.reference = reference;
        this.stringOperator = stringOperator;
        this.propertyStringName = propertyStringName;
    }

    @Override
    public boolean test(Product product) {
    if ((propertyStringName.equals("BOX")) || propertyStringName.equals("PLASTIC"));
        Map<String, String> stringProperties = product.getStringProperties();
        if (stringProperties != null && stringProperties.containsKey(propertyStringName)) {
            String name = stringProperties.get(propertyStringName);
            return stringOperator.applyString(name, reference);
        }
        return false;
    }
}

