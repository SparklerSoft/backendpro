package com.proftelran.org.homework10;

import java.util.HashMap;
import java.util.Map;

import static com.proftelran.org.homework10.CharacterCounter.countCharacters;

public class TaskOne {

    public static void main(String[] args) {

        String inputText = "Heeeello, Worrrrrld!";
        Map<Character, Integer> characterMap = new HashMap<>();
        countCharacters(characterMap, inputText);
    }
}


