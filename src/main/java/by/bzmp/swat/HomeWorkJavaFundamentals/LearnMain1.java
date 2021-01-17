package by.bzmp.swat.HomeWorkJavaFundamentals;

import java.util.Scanner;
// 2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public class LearnMain1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] array = new int[9];

            for (int i = 8; i >= 0; i--)
            {
                array[i] = i;
                 System.out.print(array[i]);
            }
        }
    }
