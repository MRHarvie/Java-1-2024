package ca.nl.ca.mitchell.harvie.Assignment4;

import java.util.Scanner;

/**
 * This class represents an application for working with Fibonacci numbers.
 * It provides a console interface to:
 * 1. Display all Fibonacci numbers less than a given value.
 * 2. Display the first n Fibonacci numbers.
 * 3. Check if a given number is a Fibonacci number.
 */
public class FibonacciApp {

    /**
     * The main method that launches the Fibonacci application
     */
    public static void main(String[] args) {
        // Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        // Instantiate the FibonacciCalculator for performing calculations
        FibonacciCalculator calculator = new FibonacciCalculator();
        // Boolean variable to control the main application loop
        boolean running = true;

        // Main.java application loop
        while (running) {
            // Display the menu options for the user
            System.out.println("\nFibonacci Application Menu:");
            System.out.println("1. Display all Fibonacci numbers less than a given value");
            System.out.println("2. Display the first n Fibonacci numbers");
            System.out.println("3. Check if a number is a Fibonacci number");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            // Get the user's menu choice
            int option = scanner.nextInt();
            // Process the user's choice based on the selected menu option
            switch (option) {
                case 1:
                    // Display all Fibonacci numbers less than a given value
                    System.out.print("Enter the maximum value: ");
                    int maxValue = scanner.nextInt();
                    System.out.println("Fibonacci numbers less than " + maxValue + ":");
                    int a = 0, b = 1;
                    // Generate and display Fibonacci numbers until reaching maxValue
                    while (a < maxValue) {
                        System.out.print(a + " ");
                        int temp = a + b;
                        a = b;
                        b = temp;
                    }
                    System.out.println();
                    break;

                case 2:
                    // Display the first n Fibonacci numbers
                    System.out.print("Enter the number of Fibonacci numbers to display: ");
                    int n = scanner.nextInt();
                    System.out.println("First " + n + " Fibonacci numbers:");
                    // Print the first n Fibonacci numbers by calling calculator method
                    for (int i = 0; i < n; i++) {
                        System.out.print(calculator.getFibonacciNumber(i) + " ");
                    }
                    System.out.println(); // Print a newline after the sequence
                    break;

                case 3:
                    // Check if a specific number is a Fibonacci number
                    System.out.print("Enter a number to check: ");
                    int number = scanner.nextInt();
                    boolean isFib = calculator.isFibonacciNumber(number);
                    // Display the result of whether the number is in the Fibonacci sequence
                    if (isFib) {
                        System.out.println(number + " is a Fibonacci number.");
                    } else {
                        System.out.println(number + " is not a Fibonacci number.");
                    }
                    break;

                case 4:
                    // Exit the application by setting running to false
                    running = false;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    // Handle invalid menu options by displaying an error message
                    System.out.println("Invalid option. Please try again.");
            }
        }
        // Close the scanner to release resources
        scanner.close();
    }
}
