package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;
import java.util.Random;

//Задание. Ввести с консоли n - размерность матрицы a [n] [n].
//Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
public class OptionalTask2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел многомерного массива");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt() / 100000000;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sort(matrix);
        printArray(matrix);
    }

    static void sort(int array[][]) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array[i].length - 1; j++) {
                    printArray(array);
                    if (array[i][j] > array[i + 1][j]) {
                        int temp = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = temp;
                        sorted = false;
                    } else {
                    }
                }
            }
        }
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}