package Lesson2.SpiralMatrix;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        int n = 1;
        int count = 0;

        System.out.println("Введите размерность массива. X = ");
        x = scanner.nextInt();
        System.out.println("Y = ");
        y = scanner.nextInt();

        int[][] spiral = new int[y][x];

        while (n <= x * y){
            for(int j = count; j < x - count; j++) spiral[count][j] = n++; // проход слева направо
            for(int i = count + 1; i < y - count; i++) spiral[i][x - count - 1] = n++; // проход сверху вниз
            for(int j = x - count - 2; j >= count; j--) spiral[y - count - 1][j] = n++; // проход справа налево
            for (int i = y - count - 2; i > count; i--) spiral[i][count] = n++; // проход снизу вверх
            count++;
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

