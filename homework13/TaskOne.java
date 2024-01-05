package com.proftelran.org.homework13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {

    public static void main(String[] args) {
        List<String> secondNameList = Arrays.asList("Kuznetsov", "Kovalov", "Semahin", "Ivanov", "Karpov", "Fedorov");
        List<String> k = secondNameList.stream().filter(element -> element.contains("K")).collect(Collectors.toList());
        System.out.println(k);
    }
}
