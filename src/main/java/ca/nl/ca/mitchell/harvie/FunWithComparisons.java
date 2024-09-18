package ca.nl.ca.mitchell.harvie;

import java.util.Scanner;

/**
 * Simple class to have fun with if statements
 */
public class FunWithComparisons {

    public static void main(String[] args) {
        System.out.println("Fun With Comparisons");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:  ");
        int x = input.nextInt();

        System.out.println("Please enter a second number:  ");
        int y = input.nextInt();

        if(x == y){
            System.out.printf("%d == %d", x, y);
        }
        if(x != y){
            System.out.printf("%d not equal to %d", x, y);
        }
        if(x < y){
            System.out.printf("%d < %d", x, y);
        }
        if(x > y) {
            System.out.printf("\n%d > %d", x, y);
        }
        if(x >= y) {
            System.out.printf("\n%d >= %d", x, y);
        }
    }
}
