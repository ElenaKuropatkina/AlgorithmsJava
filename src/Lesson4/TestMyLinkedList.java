package Lesson4;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        System.out.println("Добавляем элементы в связный список:");
        mll.insertFirst("bbb");
        mll.insertLast("ddd");
        mll.insertFirst("aaa");
        mll.insert("ccc", 2);
        System.out.println(mll.toString());
        System.out.println("Размер списка " + mll.size());
        System.out.println("Первый элемент " + mll.getFirst().getValue());
        System.out.println("Последний элемент " + mll.getLast().getValue());

        System.out.println("Проверяем вхождение элемента в список");
        System.out.println(mll.contains("bbb"));

        System.out.println("Удаление произвольного элемента");
        mll.remove("ccc");
        System.out.println(mll.toString());

        System.out.println("Удаление первого элемента");
        mll.removeFirst();
        System.out.println(mll.toString());

        System.out.println("Удаление последнего элемента");
        mll.removeLast();
        System.out.println(mll.toString());
    }
}
