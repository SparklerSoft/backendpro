package com.proftelran.org.homework8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public abstract class TaskTwo{

    public static void main(String[] args) {

        String[][] nameString = {{"Leonel", "Messi"}, {"Cristiano", "Ronaldo"}, {"Zinedine", "Zidane"}, {"Diego", "Maradona"},{"Cristiano", "Mutanto"}};

        Arrays.sort(nameString, Comparator.comparing((String[] a) -> a[0]).thenComparing(a -> a[1]));
        for(String[] names : nameString){
            for (String name : names){
                System.out.print(name + " ");
            }
            System.out.println();
        }

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Leonel Messi");
        sortedSet.add("Cristiano Ronaldo");
        sortedSet.add("Cristiano Romualdo");
        sortedSet.add("Zinedine Zidane");
        sortedSet.add("Diego Maradona");
        sortedSet.add("Diego Marabell");
        sortedSet.add("Hristo Stoichkov");
        sortedSet.add("Cristiano Caratti");

        System.out.println("\nSorted TreeSet " + sortedSet.stream().sorted().collect(Collectors.toList()));
    }
}
