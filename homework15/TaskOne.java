package com.proftelran.org.homework15;

import java.io.*;

public class TaskOne {

    public static void main(String[] args) throws IOException {
        //Create a file using FileOutputStream with the text: "This is my first experience
        // when I myself work with the IO API. I can do everything!"

        String pathToTestFile = "/Users/serglapidus/Documents/JavaPro/backendpro/src/main/java/com/proftelran/org/homework15";

        FileOutputStream fileOutputStream = new FileOutputStream(pathToTestFile + "/my_homework15_test_file.txt");

        FileWriter fileWriter = new FileWriter("/Users/serglapidus/Documents/JavaPro/backendpro/src/main/java/com/proftelran/org/homework15/my_homework15_test_file.txt");
        fileWriter.write("This is my first experience when I myself work with IO API. I can do everything!");
        fileWriter.close();
        System.out.println("File successfully created");
    }
}

