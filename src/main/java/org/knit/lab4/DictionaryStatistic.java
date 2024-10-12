package org.knit.lab4;

public class DictionaryStatistic {
    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public int getDictionarySize() {
        return dictionarySize;
    }

    public void setDictionarySize(int dictionarySize) {
        this.dictionarySize = dictionarySize;
    }

    public int getPolindrom() {
        return polindrom;
    }

    public void setPolindrom(int polindrom) {
        this.polindrom = polindrom;
    }

    public int getMaxWordKength() {
        return maxWordKength;
    }

    public void setMaxWordKength(int maxWordKength) {
        this.maxWordKength = maxWordKength;
    }

    public int getMinWoedlenght() {
        return minWoedlenght;
    }

    public void setMinWoedlenght(int minWoedlenght) {
        this.minWoedlenght = minWoedlenght;
    }

    public char[] getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public int[] getFrequency() {
        return frequency;
    }

    public void setFrequency(int[] frequency) {
        this.frequency = frequency;
    }

    private String[] words;
    private int dictionarySize;
    private int polindrom;
    private int maxWordKength;
    private int minWoedlenght;
    private char[] alphabet;
    private int[] frequency;

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
    }
}
