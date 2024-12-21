package org.knit.lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Консольный калькулятор. Введите 'exit' для выхода.");

        while (true) {
            try {

                System.out.print("Введите первое число: ");
                String inputA = scanner.nextLine().trim();
                if (inputA.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }
                double a = Double.parseDouble(inputA);


                System.out.print("Введите оператор (+, -, *, /): ");
                String operator = scanner.nextLine().trim();
                if (!operator.matches("[+\\-*/]")) {
                    System.out.println("Неверный оператор. Пожалуйста, введите один из следующих операторов: +, -, *, /");
                    continue;
                }


                System.out.print("Введите второе число: ");
                String inputB = scanner.nextLine().trim();
                if (inputB.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }
                double b = Double.parseDouble(inputB);

                double result;


                switch (operator) {
                    case "+":
                        result = calculator.add(a, b);
                        break;
                    case "-":
                        result = calculator.subtract(a, b);
                        break;
                    case "*":
                        result = calculator.multiply(a, b);
                        break;
                    case "/":
                        result = calculator.divide(a, b);
                        break;
                    default:

                        System.out.println("Неверный оператор.");
                        continue;
                }


                System.out.println("Результат: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод числа. Пожалуйста, введите корректное число.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}