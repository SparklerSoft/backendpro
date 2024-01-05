package com.proftelran.org.homework13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskTwo {

    public static void main(String[] args) {
        String[] strings = {"Apple", "Zippo", "Phantom", "Duck", "Barbell", "Barber", "Location"};
        System.out.println(Arrays.stream(strings).sorted().collect(Collectors.toList()));
    }
}
