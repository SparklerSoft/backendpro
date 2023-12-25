package com.proftelran.org.homework9.TaskTwo;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestAppMyDeque {
    public static void main(String[] args) {
        // Using CustomQueue
        MyDeque<Integer> customQueue = new MyArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            customQueue.addFirst(i);
        }
        System.out.println("Ten elements were added at first " + customQueue.size());
        for (int i = 0; i < 12; i++) {
            customQueue.addLast(i + 10);
        }
        System.out.println("Twelve elements were added to the tail " + customQueue.size());
        for (int i = 0; i < 4; i++) {
            customQueue.removeLast();
        }
        System.out.println("Four elements were deleted from the tail " + customQueue.size());
        for (int i = 0; i < 2; i++) {
            customQueue.removeFirst();
        }
        System.out.println("Two elements were deleted from the head " + customQueue.size());
        System.out.println("CustomQueue size: " + customQueue.size());

        // Using ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            arrayDeque.addFirst(i);
        }
        for (int i = 0; i < 12; i++) {
            arrayDeque.addLast(i + 10);
        }
        for (int i = 0; i < 4; i++) {
            arrayDeque.removeLast();
        }
        for (int i = 0; i < 2; i++) {
            arrayDeque.removeFirst();
        }
        System.out.println("ArrayDeque size: " + arrayDeque.size());
    }
}
