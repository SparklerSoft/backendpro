package com.proftelran.org.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookShelf {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Snow", "John Kahn", 544, 2012, "GoldenPrint"));
        books.add(new Book("Picture of the Fear", "Albert May", 841, 2000, "Amadeus"));
        books.add(new Book("The Sun", "Moon Dancer", 321, 2010, "Skulls"));
        books.add(new Book("Jungles", "Mia Wall", 432, 2001, "TrafficBook"));
        books.add(new Book("Time to run", "Ali Duke", 230, 1998, "WordWeb"));
        books.add(new Book("Electricity", "Cleana Nill", 159, 2006, "WeightBook"));
        books.add(new Book("Kelner", "Anna Pieczarka", 449, 2020, "PISBook"));

        for (int i = 0; i < books.size(); i++) {
            books.get(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the sort name from (BOOK NAME, AUTHOR, PUBLISHER, YEAR OF PUBLISH) ");
        String name = scanner.nextLine();

        if (name.toUpperCase().trim().equals("AUTHOR")) {
            Collections.sort(books, new SortBooksByAuthor());
            System.out.println("\n Sorted by AUTHOR " + "\n" + books);
        } else if (name.toUpperCase().trim().equals("PUBLISHER")) {
            Collections.sort(books, new SortBookByPublisher());
            System.out.println("\n Sorted by PUBLISHER " + "\n" + books);
        } else if (name.toUpperCase().trim().equals("YEAR OF PUBLISH")) {
            Collections.sort(books, new SortBooksByYearOfPublish());
            System.out.println("\n Sorted by YEAR OF PUBLISH " + "\n" + books);
        } else if (name.toUpperCase().trim().equals("BOOK NAME")) {
            Collections.sort(books, new SortByBookName());
            System.out.println("\n Sorted by BOOK NAME " + "\n" + books);
        } else {
            System.out.println("Unexpected value: " + name.toUpperCase());
        }
        new Scanner(String.valueOf(System.out));
    }
}
