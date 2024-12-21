package org.knit.lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static List<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему управления пользователями!");


        try {
            users = UserManager.loadUsers();
            if (!users.isEmpty()) {
                System.out.println("Список пользователей загружен из файла.");
            } else {
                System.out.println("Файл с пользователями не найден. Начинаем с пустого списка.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке пользователей: " + e.getMessage());
            users = new ArrayList<>();
        }

        boolean exit = true;
        while (exit) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    addUser();
                    break;
                case "2":
                    showUsers();
                    break;
                case "3":
                    saveUsersToFile();
                    break;
                case "4":
                    loadUsersFromFile();
                    break;
                case "5":
                    exit = false;
                    exitProgram();
                    break;
                default:
                    System.out.println("Неверная опция. Пожалуйста, выберите снова.");
            }
        }
    }


    private static void printMenu() {
        System.out.println("\nВыберите действие:");
        System.out.println("1. Добавить нового пользователя");
        System.out.println("2. Показать всех пользователей");
        System.out.println("3. Сохранить список пользователей в файл");
        System.out.println("4. Загрузить список пользователей из файла");
        System.out.println("5. Выйти");
        System.out.print("\nВведите номер действия: ");
    }


    private static void addUser() {
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Имя пользователя не может быть пустым.");
            return;
        }

        int age;
        while (true) {
            System.out.print("Введите возраст: ");
            String ageInput = scanner.nextLine().trim();
            try {
                age = Integer.parseInt(ageInput);
                if (age < 0) {
                    System.out.println("Возраст не может быть отрицательным. Попробуйте снова.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат возраста. Пожалуйста, введите целое число.");
            }
        }

        System.out.print("Введите email: ");
        String email = scanner.nextLine().trim();
        if (!isValidEmail(email)) {
            System.out.println("Неверный формат email. Попробуйте снова.");
            return;
        }

        User newUser = new User(name, age, email);
        if (users.contains(newUser)) {
            System.out.println("Ошибка: Пользователь с такими данными уже существует.");
        } else {
            users.add(newUser);
            System.out.println("Пользователь добавлен.");
        }
    }

    private static boolean isValidEmail(String email) {
        // Простая проверка формата email
        return email.contains("@") && email.contains(".") && !email.startsWith("@") && !email.endsWith("@");
    }


    private static void showUsers() {
        if (users.isEmpty()) {
            System.out.println("Список пользователей пуст.");
        } else {
            System.out.println("Список пользователей:");
            int index = 1;
            for (User user : users) {
                System.out.println(index + ". " + user);
                index++;
            }
        }
    }

    private static void saveUsersToFile() {
        try {
            UserManager.saveUsers(users);
            System.out.println("Список успешно сохранён в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении пользователей: " + e.getMessage());
        }
    }

    private static void loadUsersFromFile() {
        try {
            users = UserManager.loadUsers();
            System.out.println("Список успешно загружен из файла.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке пользователей: " + e.getMessage());
        }
    }

    private static void exitProgram() {
        try {
            UserManager.saveUsers(users);
            System.out.println("Данные сохранены. Программа завершена. До свидания!");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении пользователей: " + e.getMessage());
            System.out.println("Программа завершена без сохранения данных.");
        }
        scanner.close();
    }
}