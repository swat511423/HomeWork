package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;
//4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class LearnMain3 {

    public static void main(String[] args) {
        System.out.println("Введите целые числа");
        Scanner scan = new Scanner(System.in);

        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        int value3 = value1 + value2;
        int value4 = value1 * value2;

        System.out.println("Сумма целых чисел " + value3);
        System.out.println("Произведение целых чисел " + value4);
    }
}
