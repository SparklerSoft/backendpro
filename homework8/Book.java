package com.proftelran.org.homework8;

public class Book implements Comparable<Book>{

    private String nameBook;
    private String author;
    private int pagesBook;
    private int yearPublishBook;
    private String publisher;

    public Book(String nameBook, String author, int pagesBook, int yearPublishBook, String publisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.pagesBook = pagesBook;
        this.yearPublishBook = yearPublishBook;
        this.publisher = publisher;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesBook() {
        return pagesBook;
    }

    public void setPagesBook(int pagesBook) {
        this.pagesBook = pagesBook;
    }

    public int getYearPublishBook() {
        return yearPublishBook;
    }

    public void setYearPublishBook(int yearPublishBook) {
        this.yearPublishBook = yearPublishBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", pagesBook=" + pagesBook +
                ", yearPublishBook=" + yearPublishBook +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }
}
