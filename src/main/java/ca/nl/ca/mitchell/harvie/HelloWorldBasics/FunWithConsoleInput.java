package ca.nl.ca.mitchell.harvie.HelloWorldBasics;

import java.util.Scanner;

/**
 * in this example we will use simple console input from your keyboard
 * using a Scanner object
 */

public class FunWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int x = input.nextInt();

        System.out.println("Please enter a second number:  ");
        int y = input.nextInt();

        int sum = x + y;

        System.out.printf("\nValue input: %d", sum);
    }

}