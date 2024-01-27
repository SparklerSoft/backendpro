package com.proftelran.org.homework14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");

        System.out.println("The min object from list is: " + list.stream().min(Comparator.naturalOrder()));
    }
}
