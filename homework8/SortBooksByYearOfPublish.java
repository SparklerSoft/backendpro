package com.proftelran.org.homework8;

import java.util.Comparator;

public class SortBooksByYearOfPublish implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYearPublishBook() - (o2.getYearPublishBook());
    }
}