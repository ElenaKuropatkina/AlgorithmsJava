package Lesson4;

public class MyLinkIterator<T> {
    private Link current;
    private Link previous;
    private MyLinkedList list;

    public MyLinkIterator(MyLinkedList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public T getCurrent() {
        return (T) current.getValue();
    }

    public void insertAfter(T value) {
        Link newLink = new Link(value);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(T value) {
        Link newLink = new Link(value);
        if (previous == null) {
            newLink.next = (Link) list.getFirst();
            list.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public T deleteCurrent() {
        T value = (T) current.value;
        if (previous == null) {
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}


