package org.knit.lab6;

import java.util.*;

public class task11 {

    public static void main(String[] args) {
        SortedSet<String> students = new TreeSet<>();
        boolean exit=true;
        Scanner scanner = new Scanner(System.in);
        while (exit){
            System.out.println("Меню:\n" +
                    "1. Добавить студента\n" +
                    "2. Удалить студента\n" +
                    "3. Показать всех студентов\n" +
                    "4. Найти студента\n" +
                    "5. Выйти");
            System.out.print("Выберете ");
            String variant= scanner.next();
            System.out.print("Введите ");
            String name= scanner.next();
            if (Objects.equals(variant, "vih")){
                exit=false;
            }
        }
    }
}