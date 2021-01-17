package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

//2.Вывести числа в порядке возрастания (убывания) значений их длины.
public class LearnOptional2 {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arrayRandom = new int[number];
        System.out.println("Введите целые числа");
        for (int i = 0; i < number; i++) {
            arrayRandom[i] = scan.nextInt();
        }
        bubbleSort(arrayRandom);
    }

    static void bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                printArray(array);
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
