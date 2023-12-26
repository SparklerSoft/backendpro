package com.proftelran.org.homework11;

import java.util.*;

public class BookShelfLambda {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Snow", "John Kahn", "GoldenPrint", 2012, 544));
        books.add(new Book("Picture of the Fear", "Albert May", "Amadeus", 2000, 841));
        books.add(new Book("The Sun", "Moon Dancer", "Skulls", 2010, 321));
        books.add(new Book("Jungles", "Mia Wall", "TrafficBook", 2001, 432));
        books.add(new Book("Time to run", "Ali Duke", "WordWeb", 1998, 230));
        books.add(new Book("Electricity", "Cleana Nill", "WeightBook", 2006, 159));
        books.add(new Book("Kelner", "Anna Pieczarka", "PISBook", 2020, 449));

        //Lambda - sort by year.
        Comparator<Book> sortByYear = (o1, o2) -> o1.getYear() - o2.getYear();
        Collections.sort(books, sortByYear);
        System.out.println("Sorted by year " + books.toString());

        //Lambda - sort by pages.
        Comparator<Book> sortByPages = (o1, o2) -> o1.getPages() - o2.getPages();
        Collections.sort(books, sortByPages);
        System.out.println("Sorted by pages " + books.toString());

        //Lambda - sort by author.
        Comparator<Book> sortByAuthor = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());
        Collections.sort(books, sortByAuthor);
        System.out.println("Sorted by Author " + books.toString());

        //Lambda - sort by name.
        Comparator<Book> sortByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(books, sortByName);
        System.out.println("Sorted by Name " + books.toString());

        //Lambda - sort by publisher.
        Comparator<Book> sortByPublisher = (o1, o2) -> o1.getPublisher().compareTo(o2.getPublisher());
        Collections.sort(books, sortByPublisher);
        System.out.println("Sorted by publisher " + books.toString());

    }
}
