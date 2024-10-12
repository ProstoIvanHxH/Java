package org.knit.lab4;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/java/org/knit/lab4/dictionary.txt"));
                while (scanner.hasNext()){
                    String word = scanner.nextLine();
                    System.out.println(word);
                }
                scanner.close();

    }
}
