package Lesson3.Stack;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s;

        //  Тест работы стека
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Внесение в стек");
        stack.print();
        System.out.println("Извлечение из стека");
        for (int i = 0; i < 6; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        //   Тест работы программы поиска соответсвтия скобок (используется стек)
        System.out.println("Введите строку без пробелов, содержащую символы и скобки"); // по умолчанию в качестве разделителей используется пробел,
                                                                                        // поэтому в строке с пробелом будет считана только та часть, которая находится до пробела
        s = scanner.next();
        Expression exp = new Expression(s);
        System.out.println(exp.checkBracket());

        //   Тест работы программы чтения строки наоборот ДЗ 2 пункт (используется стек)
        System.out.println("Введите строку без пробелов"); // по умолчанию в качестве разделителей используется пробел,
                                                           // поэтому в строке с пробелом будет считана только та часть, которая находится до пробела
        s = scanner.next();
        StringInversion string = new StringInversion(s);
        System.out.println("Решение 2-го пункта домашнего задания");
        System.out.println("Строка наоборот: " + string.inversion());

    }

}
