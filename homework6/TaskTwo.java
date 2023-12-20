package com.proftelran.org.homework6;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Peach");
        stringList.add("Watermelon");
        stringList.add("Pomegranate");
        stringList.add("Pineapple");
        stringList.add("Mango");
        System.out.print(stringList);
        System.out.println();

        List<Integer> stringsLength = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            int length = stringList.get(i).length();
            stringsLength.add(length);
        }
        System.out.println("Strings length is " + stringsLength);
    }
}
