package org.knit.lab4;

import java.util.Random;

public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов-палиндромов
    private int maxWordLength; // Максимальная длина слова в словаре
    private int minWordLength; // Минимальная длина слова в словаре

    public char[] getAlphabet() {
        return alphabet;
    }

    private char[] alphabet; // Буквы алфавита
    private int[] frequency; // Частота букв в словаре

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.frequency = new int[alphabet.length];
        analyzeDictionary();
    }


    private void analyzeDictionary() {
        dictionarySize = words.length;
        polindrom = 0;
        maxWordLength = 0;
        minWordLength = Integer.MAX_VALUE;

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if (isPalindrome(lowerWord)) {
                polindrom++;
            }

            int length = lowerWord.length();
            if (length > maxWordLength) {
                maxWordLength = length;
            }
            if (length < minWordLength) {
                minWordLength = length;
            }


            for (char c : lowerWord.toCharArray()) {
                int index = getAlphabetIndex(c);
                if (index != -1) {
                    frequency[index]++;
                }
            }
        }
    }


    private boolean isPalindrome(String word) {
        int len = word.length();
        for(int i = 0; i < len / 2; i++) {
            if(word.charAt(i) != word.charAt(len - i -1)) {
                return false;
            }
        }
        return true;
    }

    private int getAlphabetIndex(char c) {
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == c) {
                return i;
            }
        }
        return -1;
    }


    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(dictionarySize);
        return words[index];
    }

    public void printSymbolsStat() {
        System.out.println("Статистика букв алфавита:");
        for(int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
    }


    public int getDictionarySize() {
        return dictionarySize;
    }


    public int getPolindrom() {
        return polindrom;
    }


    public int getMaxWordLength() {
        return maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }


    public String[] getWords() {
        return words;
    }
}