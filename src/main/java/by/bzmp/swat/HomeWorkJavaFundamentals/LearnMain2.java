package by.bzmp.swat.HomeWorkJavaFundamentals;

//3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class LearnMain2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i : a) {
            System.out.print(i * Math.random() * 10 + " ");
        }
        for (int i : a) {
            System.out.println(i * Math.random() * 10);
        }
    }
}