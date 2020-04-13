package Lesson4;

public class MyStackList<T> {

    private LinkedList list;

    public MyStackList() {
        list = new LinkedList();
    }

    public void push(T value) {
        list.insert(value);
    }

    public T pop() {
        return (T) list.delete().value;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }

}
