package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;
//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class LearnMain4 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(month(n));
    }

    private static String month(int n) {
        String[] month = {"","January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        if(n > 0 && n <13) return month[n];
        else return "Месяц не найден";
    }
}
