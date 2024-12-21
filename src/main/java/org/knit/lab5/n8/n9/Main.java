package org.knit.lab5.n8.n9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String dictionaryPath = "C:\\Users\\Ivan\\IdeaProjects\\Java\\src\\main\\java\\org\\knit\\lab4\\dictionary.txt";

        List<String> words = getWords(dictionaryPath);


        Scanner inputScanner = new Scanner(System.in);


        long startTime = System.currentTimeMillis();
        long oneMinute = 60_000;
        long endTime = startTime + oneMinute;

        Random random = new Random();

        int totalWords = 0;
        int correctWords = 0;
        int totalCharacters = 0;

        System.out.println("Вам будут показываться случайные слова. Введите их как можно быстрее в течение одной минуты!");
        System.out.println("Нажмите Enter, чтобы начать...");
        inputScanner.nextLine();

        while (System.currentTimeMillis() < endTime) {
            String currentWord = words.get(random.nextInt(words.size()));
            System.out.println("Введите слово: " + currentWord);
            totalWords++;


            long currentTime = System.currentTimeMillis();
            long remainingTime = endTime - currentTime;

            String userInput = null;

            if (remainingTime <= 0) {
                break;
            }

            userInput = inputScanner.nextLine();

            long afterInput = System.currentTimeMillis();
            if (afterInput > endTime) {

                break;
            }

            totalCharacters += userInput.length();


            if (userInput.equals(currentWord)) {
                correctWords++;
            }
        }

        inputScanner.close();

        long totalTime = System.currentTimeMillis() - startTime;
        double totalTimeSeconds = totalTime / 1000.0;

        System.out.println("\nРезультаты:");
        System.out.println("Всего было показано слов: " + totalWords);
        System.out.println("Количество правильно введенных слов: " + correctWords);
        System.out.println("Общее количество введенных символов: " + totalCharacters);

        double speed = totalCharacters / totalTimeSeconds;
        System.out.printf("Скорость ввода: %.2f символов в секунду.%n", speed);
    }


    public static List<String> getWords(String path) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + path);
        }
        return words;
    }
}