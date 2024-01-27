package com.proftelran.org.homework16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree {
    //Check password  8 letters, digit,letters and something else
    public static void main(String[] args) {
        String source = "Sd4&hn*Nsa";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        System.out.println("Is matched " + matcher.matches());
    }
}
