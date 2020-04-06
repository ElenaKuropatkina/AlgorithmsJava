package Lesson2.ArraySort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int l = 1000001;
        MyArray myArray = new MyArray(l);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < l; i++) {
            myArray.add((int) Math.round(Math.random() * 100));
        }
        System.out.println("Введите номер сортировки: 1 - пузырьковая сортировка, 2 - сортировка выбором, 3 - сортировка вставкой");
        int c = scanner.nextInt();
        long t = System.currentTimeMillis();

        switch (c) {
            case 1:
                myArray.bubbleSort();
                System.out.println("Время пузырьковой сортировки массива из " + l + " элементов составляет: " + (System.currentTimeMillis() - t) + " мс");
                break;
            case 2:
                myArray.selectSort();
                System.out.println("Время сортировки выбором массива из " + l + " элементов составляет: " + (System.currentTimeMillis() - t) + " мс");
                break;
            case 3:
                myArray.insertSort();
                System.out.println("Время сортировки вставкой массива из " + l + " элементов составляет: " + (System.currentTimeMillis() - t) + " мс");
                break;
        }
    }
}

