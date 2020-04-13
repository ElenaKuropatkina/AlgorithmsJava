package Lesson4;

public class MyQueueList<T> {
    private MyLinkedList queue;

    public MyQueueList() {
        queue = new MyLinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(T value) {
        queue.insertLast(value);
    }

    public T delete() {
        return (T) queue.removeFirst();
    }

    public void display() {
        System.out.println(queue.toString());
    }
}
