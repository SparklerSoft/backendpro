package com.proftelran.org.homework14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        System.out.println("Sorted list in the direct order: " + list.stream().sorted().distinct().collect(Collectors.toList()));
        System.out.println("Sorted list in the reverse order: " + list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()));
    }
}
