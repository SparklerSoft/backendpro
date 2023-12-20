package com.proftelran.org.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0, 3);
        integerList.add(1, 4);
        integerList.add(2, 6);
        integerList.add(3, 1);
        integerList.add(4, 9);

        System.out.print("Integers list " + integerList);
        System.out.println();

        List<Integer> doubledIntegerList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            doubledIntegerList.add(integerList.get(i) * 2);
        }
        System.out.print("New integers " + doubledIntegerList);
    }
}

