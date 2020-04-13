package Lesson4;

public class TestMyStackList {
    public static void main(String[] args) {

        MyStackList<String> sl = new MyStackList<>();

        System.out.println("Добавляем элементы");
        sl.push("aaa");
        sl.push("bbb");
        sl.push("ccc");
        sl.push("ddd");
        sl.display();

        System.out.println("Удаляем элементы");
        while (!sl.isEmpty()) {
            sl.pop();
            sl.display();
            System.out.println();
        }
    }
}
