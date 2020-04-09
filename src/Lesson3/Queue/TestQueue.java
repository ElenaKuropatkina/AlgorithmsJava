package Lesson3.Queue;

public class TestQueue {
    public static void main(String[] args) {

        //  Тест работы очереди
        MyQueue<Integer> queue = new MyQueue<>(5);
        for (int i = 0; i < 5; i++) {
            queue.insert(i);
        }
        System.out.println("Внесение элемента в очередь");
        queue.print();
        System.out.println("Удаление элемента из очереди");
        for (int i = 0; i < 5; i++) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();

        // Тест работы приоритетной очереди
        MyPriorityQueue<Character> mpq = new MyPriorityQueue<>();
        System.out.println("Работа приоритетной очереди:");
        mpq.insert('b');
        System.out.println(mpq);
        mpq.insert('a');
        System.out.println(mpq);
        mpq.insert('f');
        System.out.println(mpq);

        System.out.println(mpq.remove());
        System.out.println(mpq);
    }
}
