package by.bzmp.swat.HomeWorkJavaCollectionsOptional;

import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;

//2.Ввести число, занести его цифры в стек.
// Вывести число, у которого цифры идут в обратном порядке.
//4.Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
//5.Не используя вспомогательных объектов, переставить отрицательные элементы
// данного списка в конец, а положительные — в начало списка.

public class OptionalTask {
    public static void main(String[] args) {
        new OptionalTask().secondTask();
        new OptionalTask().fourthTask();
        new OptionalTask().fifthTask();
    }

    public OptionalTask secondTask() {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber = 0;
        try {
            inputNumber = scanner.nextInt();
        } catch (InputMismatchException fg) {
            System.out.println(" Вы ввели не число");
        }
        char[] numbers = String.valueOf(inputNumber).toCharArray();
        for (char number : numbers) {
            stack.push(number);
        }
        while (!stack.empty()) {
            char stackNumber;
            stackNumber = (Character) stack.pop();
            System.out.print(stackNumber);
        }
        return this;
    }

    public OptionalTask fourthTask() {
        List<String> poem = new ArrayList<>();
        poem.add("Не страшен этот белый кот");
        poem.add("Ни крысам, ни мышам,");
        poem.add("Частенько с ними он ведет");
        poem.add("Беседу по душам.");
        poem.add("Мышей он ласково зовет");
        poem.add("Из ящика без крышки.");
        poem.add("- Эй, малыши! - мурлычет кот,");
        poem.add("Давайте в кошки-мышки!");

        for (int i = 0; i < poem.size(); i++) {
            for (int j = 0; j < poem.size() - i - 1; j++) {
                if ((poem.get(j)).length() > (poem.get(j + 1)).length()) {
                    Collections.swap(poem, j, j + 1);
                }
            }
        }

        for (String str : poem) {
            System.out.println(str);
        }
        return this;
    }

    public void fifthTask() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        int lowerBound = -15;
        int upperBound = 15;

        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < 15; i++) {
            int number = lowerBound + random.nextInt(upperBound * 2);
            listOfNumbers.add(number);
        }
        Collections.sort(listOfNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        System.out.println(listOfNumbers);
    }
}
