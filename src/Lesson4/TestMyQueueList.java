package Lesson4;

public class TestMyQueueList {
    public static void main(String[] args) {

        MyQueueList<String> ql = new MyQueueList<>();

        System.out.println("Добавляем элементы");
        ql.insert("aaa");
        ql.insert("bbb");
        ql.insert("ccc");
        ql.insert("ddd");
        ql.display();

        System.out.println("Удаляем элементы");
        while (!ql.isEmpty()) {
            ql.delete();
            ql.display();
            System.out.println();
        }
    }
}
