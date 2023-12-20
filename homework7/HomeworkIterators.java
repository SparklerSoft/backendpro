package com.proftelran.org.homework7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeworkIterators {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            integerList.add(i);
        }

        //1. for loop - usual
        long start = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i <= integerList.size(); i++) {
            temp = i;
        }
        long end = System.currentTimeMillis();
        System.out.println("For loop " + temp);
        System.out.println("Time for execute is " + (end - start));

        //2. for-each loop
        long start2 = System.currentTimeMillis();
        int temp2 = 0;
        for (int element : integerList) {
            temp2 = element;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("For-each loop " + temp2);
        System.out.println("Time for execute is " + (end2 - start2));

        //3. for loop and integerList.size = variable
        long start3 = System.currentTimeMillis();
        int temp3 = 0;
        int size = integerList.size();
        for (int i = 0; i <= size; i++) {
            temp3 = i;
        }
        long end3 = System.currentTimeMillis();
        System.out.println("For loop with variable " + temp3);
        System.out.println("Time for execute is " + (end3 - start3));

        //4. for loop and count i--
        long start4 = System.currentTimeMillis();
        int temp4 = 0;
        int size2 = integerList.size();
        for (int i = size2; i >= 0; i--) {
            temp4 = i;
        }
        long end4 = System.currentTimeMillis();
        System.out.println("For loop with variable and count i-- " + temp4);
        System.out.println("Time for execute is " + (end4 - start4));

        //5.iterator
        Iterator<Integer> iterator = integerList.iterator();
        long start5 = System.currentTimeMillis();
        int temp5 = 0;
        while (iterator.hasNext()) {
            temp5 = iterator.next();
        }
        long end5 = System.currentTimeMillis();
        System.out.println("For iterator " + temp5);
        System.out.println("Time for execute is " + (end5 - start5));

        //6.listIterator
        Iterator<Integer> iterator2 = integerList.listIterator();
        long start6 = System.currentTimeMillis();
        int temp6 = 0;
        while (iterator2.hasNext()) {
            temp6 = iterator2.next();
        }
        long end6 = System.currentTimeMillis();
        System.out.println("For listIterator " + temp6);
        System.out.println("Time for execute is " + (end6 - start6));
    }
}



