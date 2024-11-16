package org.knit.lab2;

import java.util.Scanner;

public class Calculator {
    public void execute() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();

    }
}
