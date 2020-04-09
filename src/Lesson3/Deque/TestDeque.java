package Lesson3.Deque;

public class TestDeque {
    public static void main(String[] args) {

        //Тест работы двухсторонней очереди

        MyDeque<Integer> deque = new MyDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addFirst(7);
        deque.addLast(8);

        int tmp = deque.size();
        System.out.println("Добавление элементов в дек в произвольном порядке (с начала и с конца)");
        deque.print();
        System.out.println("Извлечение элементов с начала дека:");
        for (int j = 0; j < tmp; j++) {
            System.out.print(deque.removeFirst() + " ");
        }
        System.out.println();
        System.out.println("Добавление элементов в дек с начала");
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);

        tmp = deque.size();
        deque.print();
        System.out.println("Извлечение элементов с конца дека:");
        for (int k = 0; k < tmp; k++) {
            System.out.print(deque.removeLast() + " ");
        }
        System.out.println();

        System.out.println("Добавление элементов в дек с конца");
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        tmp = deque.size();
        deque.print();
        System.out.println("Извлечение элементов в произвольном порядке (с начала и с конца)");
        deque.removeFirst();
        System.out.print("Удаляем первый элемент: ");
        deque.print();
        deque.removeLast();
        System.out.print("Удаляем последний элемент: ");
        deque.print();
        deque.removeLast();
        System.out.print("Удаляем последний элемент: ");
        deque.print();
        deque.removeFirst();
        System.out.print("Удаляем первый элемент: ");
        deque.print();
        deque.removeLast();
        System.out.println("Удаляем последний элемент");
        System.out.println("Размер дека после удаления в произвольном порядке: " + deque.size());

    }
}
