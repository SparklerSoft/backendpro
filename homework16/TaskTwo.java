package com.proftelran.org.homework16;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    //Check email
    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "name@mail.com", "name88@mail.org", "My_mail@yahoo.com", "my_hard_mail99@domain.com", "710232@gmail.com"
        );


        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            System.out.println(string + " - " + matcher.matches());
        }
    }
}
