package com.proftelran.org.homework15;

import java.io.File;

public class TaskThree {

    public static void main(String[] args) {

        //Create a method to delete a directory and subdirectories

        String userHome = System.getProperty("user.home") + File.separator + "Desktop";
        File directory = new File(userHome, "new_TEST_folder");

        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Directory successfully created: " + directory.getName());
        }

        String directoryPath = "/Users/serglapidus/Desktop/new_TEST_folder";
        deleteDirectory(new File(directoryPath));
    }

    public static void deleteDirectory(File directory) {
        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                    System.out.println("Directory deleted: " + file.getName());
                } else {
                    file.delete();
                    System.out.println("File deleted: " + file.getName());
                }
            }
        }

        if (!directory.delete()) {
            System.out.println("Failed to delete directory: " + directory);
        } else {
            System.out.println("Directory deleted successfully: " + directory);
        }
    }
}
