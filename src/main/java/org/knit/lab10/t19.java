package org.knit.lab10;


public class t19{
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(findMax(numbers)); // 5

        String[] words = {"apple", "banana", "cherry"};
        System.out.println(findMax(words)); // cherry
    }
}