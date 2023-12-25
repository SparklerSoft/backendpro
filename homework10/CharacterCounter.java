package com.proftelran.org.homework10;

import java.util.Map;

public class CharacterCounter {

    public static void countCharacters(Map<Character, Integer> charMap, String text) {

        for (char c : text.toCharArray()) {

            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character\tCount");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println("    " + entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
