package by.bzmp.swat.HomeWorkJavaClasses;

import by.bzmp.swat.HomeWorkJavaClasses.domain.Student;
import by.bzmp.swat.HomeWorkJavaClasses.domain.University;

import java.util.ArrayList;
import java.util.List;

//Cоздать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов.
//Задать критерий выбора данных и вывести эти данные на консоль.
//В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.
public class Main {
    public static void main(String[] args) {

        University university = new University("Stanford");

        Student stud1 = new Student("Mishkun", "Evgenii", "Victorovich", "Capova 102, 14", "za-95",
                "economic", 6372886, 12312355, 5, 18, 9, 90);
        Student stud2 = new Student("Pupkin", "Vlad", "Petrovich", "Corovina 43,29", "za-95",
                "economic", 3784898, 12323123, 5, 28, 11, 90);
        Student stud3 = new Student("Geradot", "Abakan", "Semionovich", "Lenina 31,11", "za-96",
                "math", 3248958, 12332331, 4, 13, 7, 91);
        Student stud4 = new Student("Kurlap", "Vasilii", "Alexeevich", "Gagarina 12,44", "za-95",
                "economic", 4568048, 34382387, 5, 18, 5, 92);
        Student stud5 = new Student("Burkin", "Stas", "Olegovich", "Chapaeva 21,19", "za-96",
                "math", 3248957, 94789898, 4, 22, 6, 93);
        Student stud6 = new Student("Mixailova", "Elena", "Vasilievna", "Komarovo 18,116", "za-95",
                "economic", 3425888, 32804780, 5, 1, 5, 93);
        Student stud7 = new Student("Kurtapov", "Anton", "Alexandrovich", "Chalovskoi 24,1", "za-95",
                "economic", 3429058, 18923470, 5, 8, 5, 90);
        Student stud8 = new Student("Astasheva", "Anastasia", "Grigorievna", "Pr. Pobedy 22,161", "za-96",
                "math", 2394588, 10289439, 4, 14, 6, 90);
        Student stud9 = new Student("Kartavetz", "Ilia", "Victorovich", "Mixailova 98,33", "za-95",
                "economic", 4568888, 12390889, 5, 12, 8, 95);
        Student stud10 = new Student("Amwayetz", "Pavel", "Konstantinovich", "Leonova 78,29", "za-95",
                "economic", 2435888, 43892598, 5, 4, 3, 93);
        Student stud11 = new Student("Karkusha", "Igor", "Mixailovich", "Trampa 55,99", "za-96",
                "math", 1234888, 12348788, 4, 21, 3, 92);
        university.addStudent(stud1);
        university.addStudent(stud2);
        university.addStudent(stud3);
        university.addStudent(stud4);
        university.addStudent(stud5);
        university.addStudent(stud6);
        university.addStudent(stud7);
        university.addStudent(stud8);
        university.addStudent(stud9);
        university.addStudent(stud10);
        university.addStudent(stud11);

        List<Student> listByFaculty = university.getListByFaculty("economic");
        System.out.println("Список студентов экономического факультета" + listByFaculty);

        List<Student> listByGroup = university.getListByGroup("za-96");
        System.out.println("Список студентов группы за-95" + listByGroup);

        System.out.println("Список 4 курса математического факультета");
        ArrayList<Student> listByCourse = university.getListByCourse(4);
        for (Student stud : listByCourse) {
            System.out.println(stud);
        }
        List<Student> listByFaculty1 = university.getListByFaculty("math");
        for (Student stud : listByFaculty1) {
            System.out.println(stud);
        }
        System.out.println("Список 5 курса экономического факультета");
        ArrayList<Student> listByCourse1 = university.getListByCourse(5);
        for (Student stud : listByCourse1) {
            System.out.println(stud);
        }
        List<Student> listByFaculty2 = university.getListByFaculty("economic");
        for (Student stud : listByFaculty2) {
            System.out.println(stud);
        }
        System.out.println("Список студентов родившихся после 1990 года");
        ArrayList<Student> listByDate = university.getListByDateOfBirth(90);
        for (Student stud : listByDate) {
            System.out.println(stud);
        }
    }
}