package com.proftelran.org.homework9.TaskTwo;

public interface MyDeque<T> {
    void addFirst(T element);

    void addLast(T element);

    T removeFirst();

    T removeLast();

    int size();
}
