package com.proftelran.org.homework9.TaskTwo;

import java.util.ArrayList;
import java.util.List;

public class MyArrayDeque<T> implements MyDeque<T> {
    private List<T> queue;

    public MyArrayDeque() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void addFirst(T element) {
        queue.add(0, element);
    }

    @Override
    public void addLast(T element) {
        queue.add(element);
    }

    @Override
    public T removeFirst() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    @Override
    public T removeLast() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(queue.size() - 1);
    }

    @Override
    public int size() {
        return queue.size();
    }
}
