package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;

//1.Приветствовать любого пользователя при вводе его имени через командную строку.
public class LearnMain {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
