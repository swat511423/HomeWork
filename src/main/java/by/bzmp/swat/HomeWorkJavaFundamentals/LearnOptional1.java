package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;
//Задание. Ввести n чисел с консоли.
//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class LearnOptional1 {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] arrayRandom = new int[number];

        System.out.println("Введите целые числа");

        for (int i = 0; i < number; i++) {
            arrayRandom[i] = scan.nextInt();
            PrintMaxElement(arrayRandom);
            PrintMinElement(arrayRandom);
        }
    }

    static void PrintMaxElement (int[] array){
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Max Element" + max);
    }

    static void PrintMinElement (int[] array){
        int min = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Min Element" + min);
    }
}
