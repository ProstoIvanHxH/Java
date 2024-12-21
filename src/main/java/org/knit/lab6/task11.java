package org.knit.lab6;


import java.util.Scanner;
import java.util.TreeSet;

public class task11 {
    public static void main(String[] args) {

        TreeSet<String> students = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Выйти");
            System.out.print("\nВыберите опцию: ");

            String option = scanner.nextLine().trim();

            switch (option) {
                case "1":
                    System.out.print("Введите имя студента: ");
                    String newStudent = scanner.nextLine().trim();
                    if (newStudent.isEmpty()) {
                        System.out.println("Имя студента не может быть пустым.");
                        break;
                    }
                    if (students.contains(newStudent)) {
                        System.out.println("Ошибка: Студент с именем \"" + newStudent + "\" уже существует.");
                    } else {
                        students.add(newStudent);
                        System.out.println("Студент \"" + newStudent + "\" добавлен.");
                    }
                    break;

                case "2":

                    System.out.print("Введите имя студента для удаления: ");
                    String removeStudent = scanner.nextLine().trim();
                    if (removeStudent.isEmpty()) {
                        System.out.println("Имя студента не может быть пустым.");
                        break;
                    }
                    if (students.remove(removeStudent)) {
                        System.out.println("Студент \"" + removeStudent + "\" удален.");
                    } else {
                        System.out.println("Ошибка: Студент с именем \"" + removeStudent + "\" не найден.");
                    }
                    break;

                case "3":

                    if (students.isEmpty()) {
                        System.out.println("Список студентов пуст.");
                    } else {
                        System.out.println("Список студентов:");
                        for (String student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case "4":

                    System.out.print("Введите имя студента для поиска: ");
                    String searchStudent = scanner.nextLine().trim();
                    if (searchStudent.isEmpty()) {
                        System.out.println("Имя студента не может быть пустым.");
                        break;
                    }
                    if (students.contains(searchStudent)) {
                        System.out.println("Студент \"" + searchStudent + "\" найден.");
                    } else {
                        System.out.println("Студент \"" + searchStudent + "\" не найден.");
                    }
                    break;

                case "5":

                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверная опция. Пожалуйста, выберите снова.");
            }
        }
    }
}
//public class task11 {
//
//    public static void main(String[] args) {
//        SortedSet<String> students = new TreeSet<>();
//        boolean exit=true;
//        Scanner scanner = new Scanner(System.in);
//        while (exit){
//            System.out.println("Меню:\n" +
//                    "1. Добавить студента\n" +
//                    "2. Удалить студента\n" +
//                    "3. Показать всех студентов\n" +
//                    "4. Найти студента\n" +
//                    "5. Выйти");
//            System.out.print("Выберете ");
//            String variant= scanner.next();
//            System.out.print("Введите ");
//            String name= scanner.next();
//            if (Objects.equals(variant, "vih")){
//                exit=false;
//            }
//        }
//    }
//}