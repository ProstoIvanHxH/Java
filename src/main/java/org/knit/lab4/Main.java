package org.knit.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        char[] russianAlphabet = {
                'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н',
                'о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь',
                'э','ю','я'
        };


        List<String> wordList = new ArrayList<>();

        Scanner scanner = new Scanner(new File("C:\\Users\\Ivan\\IdeaProjects\\Java\\src\\main\\java\\org\\knit\\lab4\\dictionary.txt"));
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine().trim();
            if(!word.isEmpty()) {
                wordList.add(word);
            }
        }
        scanner.close();



        String[] wordsArray = wordList.toArray(new String[0]);


        DictionaryStatistic dictionary = new DictionaryStatistic(wordsArray, russianAlphabet);

        System.out.println("Общее количество слов в словаре: " + dictionary.getDictionarySize());
        System.out.println("Количество палиндромов: " + dictionary.getPolindrom());
        System.out.println("Максимальная длина слова: " + dictionary.getMaxWordLength());
        System.out.println("Минимальная длина слова: " + dictionary.getMinWordLength());

        System.out.println("Случайное слово из словаря: " + dictionary.getRandomWord());

        dictionary.printSymbolsStat();

        playWordGame(dictionary);
    }

    private static void playWordGame(DictionaryStatistic dictionary) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Игра в слова ---");
        System.out.print("Введите слово: ");
        String inputWord = scanner.nextLine().trim().toLowerCase();

        if(inputWord.isEmpty()) {
            System.out.println("Введено пустое слово.");
            return;
        }


        int[] inputFrequency = getLetterFrequency(inputWord, dictionary);


        List<String> possibleWords = new ArrayList<>();
        for(String word : dictionary.getWords()) {
            String lowerWord = word.toLowerCase();
            if(canFormWord(lowerWord, inputFrequency, dictionary)) {
                possibleWords.add(word);
            }
        }

        System.out.println("Варианты слов:");
        for(String w : possibleWords) {
            System.out.println(w);
        }

        System.out.println("Всего найдено: " + possibleWords.size() + " слов.");
    }


    private static int[] getLetterFrequency(String word, DictionaryStatistic dictionary) {
        char[] alphabet = dictionary.getAlphabet();
        int[] frequency = new int[alphabet.length];

        for(char c : word.toCharArray()) {
            int index = getAlphabetIndex(c, alphabet);
            if(index != -1) {
                frequency[index]++;
            }
        }
        return frequency;
    }


    private static boolean canFormWord(String word, int[] inputFrequency, DictionaryStatistic dictionary) {
        char[] alphabet = dictionary.getAlphabet();
        int[] wordFrequency = new int[alphabet.length];

        for(char c : word.toCharArray()) {
            int index = getAlphabetIndex(c, alphabet);
            if(index == -1) {

                return false;
            }
            wordFrequency[index]++;
            if(wordFrequency[index] > inputFrequency[index]) {
                return false;
            }
        }
        return true;
    }

    private static int getAlphabetIndex(char c, char[] alphabet) {
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == c) {
                return i;
            }
        }
        return -1;
    }
}