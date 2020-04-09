package Lesson3.Deque;

import java.util.EmptyStackException;

public class MyDeque<Item> {

    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size");
        }
        list = (Item[]) new Object[capacity];
    }

    public MyDeque() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public void addFirst(Item item) {
        if (isFull()) {
            throw new StackOverflowError("Overflow");
        }
        size++;
        for (int i = size; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = item;
    }

    public void addLast(Item item) {
        if (isFull()) {
            throw new StackOverflowError("Overflow");
        }
        list[size] = item;
        size++;
    }

    public Item peekFirst() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[0];
    }

    public Item peekLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public Item removeFirst() {
        Item item = peekFirst();
        for (int i = 0; i < size; i++) {
            list[i] = list[i + 1];
        }
        list[size] = null;
        size--;
        return item;
    }

    public Item removeLast() {
        Item tmp = peekLast();
        size--;
        list[size] = null;
        return tmp;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}


