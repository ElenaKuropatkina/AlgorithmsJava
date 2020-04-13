package Lesson4;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.insert("aaa");
        ll.insert("bbb");
        ll.insert("ccc");
        ll.insert("ddd");
        ll.display();
        ll.delete();
        ll.display();
        System.out.println("Искомый элемент " + ll.find("ccc"));
    }
}
