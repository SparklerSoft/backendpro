package com.proftelran.org.homework6;
import java.util.ArrayList;
import java.util.List;

public class TaskFour {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Peach");
        stringList.add("Watermelon");
        stringList.add("Pomegranate");
        stringList.add("Pineapple");
        stringList.add("Mango");
        stringList.add("Apple");
        stringList.add("Mango");
        System.out.print("Started strings list " + stringList);
        System.out.println();

        List<String> distinct = stringList.stream().distinct().toList();
        System.out.println("Distinct strings list " + distinct);
    }
}


