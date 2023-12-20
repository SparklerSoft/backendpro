package com.proftelran.org.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        
        for (int i = 0; i < 15; i++) {
            integerList.add(i);
        }
        System.out.print("Started integer list " + integerList);
        System.out.println();

        List<Integer> integerList1 = new ArrayList<>();
        for (int i=0; i < integerList.size(); i++){
            if(integerList.get(i) % 2 != 0){
                integerList1.add(i);
            }
        }
        System.out.print("New integer list " + integerList1);

    }
}
