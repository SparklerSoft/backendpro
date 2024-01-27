package com.proftelran.org.homework16;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    //Check phone number 7 digit, 7777777 or 777-7777 or  777 7777 : range (0-9)
    public static void main(String[] args) {

        String regex = "^(\\d{7}|\\d{3}[-\\s]\\d{4})$";

        List<String> phones = Arrays.asList(
                "7777777", "000-7777", "888 7777", "453-6688", "123-45-67", "012 01-02"
        );
        Pattern pattern = Pattern.compile(regex);
        for (String phone : phones) {
            Matcher matcher = pattern.matcher(phone);
            System.out.println(phone + " - " + matcher.matches());
        }
    }
}
