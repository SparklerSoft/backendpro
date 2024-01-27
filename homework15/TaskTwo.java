package com.proftelran.org.homework15;

import java.io.File;
import java.io.IOException;

public class TaskTwo {

    public static void main(String[] args) {
    //Create a file using new File() in the Desktop directory, make sure the file exists, delete the file.

        String path = "/Users/serglapidus/Desktop";
        File myNewTestFile = new File(path + "/my_test_homework_desktop_file.txt");
        try {
            if (myNewTestFile.createNewFile()) {
                System.out.println("Created file " + myNewTestFile.getName());
            } else {
                System.out.println("File is already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        File deleteFile = new File("/Users/serglapidus/Desktop/my_test_homework_desktop_file.txt");
        boolean delete = deleteFile.delete();
        System.out.println("The file " + deleteFile.getName() + " was deleted");
        System.out.println(delete);
    }
}
