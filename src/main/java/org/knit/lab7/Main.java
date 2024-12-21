package org.knit.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    private static long totalWordCount = 0;

    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\Ivan\\IdeaProjects\\Java";

        Path startPath = Paths.get(directoryPath);


        try {

            Files.walkFileTree(startPath, new TxtFileVisitor());
            System.out.println("\nОбщее количество слов во всех текстовых файлах: " + totalWordCount);
        } catch (IOException e) {
            System.err.println("Ошибка при обходе файлов: " + e.getMessage());
        }
    }


    private static class TxtFileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

            if (file.toString().endsWith(".txt")) {
                try {
                    long wordCount = countWords(file);
                    System.out.println("Файл: " + file.toString() + " - Слов: " + wordCount);
                    totalWordCount += wordCount;
                } catch (IOException e) {
                    System.err.println("Не удалось прочитать файл: " + file.toString());
                }
            }
            return FileVisitResult.CONTINUE;
        }

        private static long countWords(Path filePath) throws IOException {
            long wordCount = 0;

            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Разбиваем строку на слова, используя пробелы и другие разделители
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }

            return wordCount;
        }
        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {

            System.err.println("Не удалось посетить файл: " + file.toString());
            return FileVisitResult.CONTINUE;
        }
    }
}