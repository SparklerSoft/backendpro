package com.proftelran.org.homework11;

public class Book implements Comparable<Book> {

    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;

    public Book(String name, String author, String publisher, int year, int pages) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
