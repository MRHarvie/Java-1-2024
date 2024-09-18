package ca.nl.ca.mitchell.harvie.HelloWorldBasics;
import java.util.Scanner;
/**
 * Having fun with the math operations
 */
public class FunWithMathOperations {
    public static void main(String[] args) {
        System.out.println("Fun with Math!");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:  ");
        int x = input.nextInt();

        System.out.println("Please enter a second number:  ");
        int y = input.nextInt();

        System.out.println("Please enter a third number:   ");
        int z = input.nextInt();

        //Addition
        System.out.printf("\nSum of %d and %d and %d is %d", x, y, z, x+y+z);
        //Subtraction
        System.out.printf("\nSubstrate of %d and %d is %d", x, y, x-y);
        //Division
        System.out.printf("\nQuotient of %d and %d is %d", x, y, x/y);
        //Multiplication
        System.out.printf("\nMultiple of %d and %d is %d", x, y, x*y);
        //Remainder
        System.out.printf("\nRemainder of %d and %d is %d", x, y, x%y);

    }
}
