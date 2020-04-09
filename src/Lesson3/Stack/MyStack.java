package Lesson3.Stack;

import java.util.EmptyStackException;

public class MyStack<Item> {
    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size");
        }
        list = (Item[]) new Object[capacity];
    }

    public MyStack() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(Item item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        list[size] = item;
        size++;
    }

    public Item pop() {
        Item tmp = peek();
        size--;
        list[size] = null;
        return tmp;
    }

    private Item peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity(int newCapacity) {
        Item[] tmp = (Item[]) new Object[newCapacity];
        System.arraycopy(list, 0, tmp, 0, size);
        list = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
