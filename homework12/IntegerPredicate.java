package com.proftelran.org.homework12;


import java.util.Map;
import java.util.function.Predicate;

public  class IntegerPredicate implements Predicate<Product> {

    private int referenceValue;
    private IntegerOperator operator;
    private String propertyName;

    public IntegerPredicate(int referenceValue, IntegerOperator operator, String propertyName) {
        this.referenceValue = referenceValue;
        this.operator = operator;
        this.propertyName = propertyName;
    }

    //I need to change the return parameter and compare objects
    //@Override
//    public static void test(Product product, IntegerOperator operator) {
//        List<Product> productList;
//        if (product.equals(operator)) {
//            productList = new ArrayList<>();
//            productList.add(product);
//            System.out.println(productList);
//        }
//    }

    @Override
    public boolean test(Product product) {
        if (propertyName.equals("WEIGHT") || propertyName.equals("AMOUNT")) {
            Map<String, Integer> integerProperties = product.getIntegerProperties();
            if (integerProperties != null && integerProperties.containsKey(propertyName)) {
                Integer productWeight = integerProperties.get(propertyName);
                return operator.apply(productWeight, referenceValue);
            }
        }
        return false;
    }
}
