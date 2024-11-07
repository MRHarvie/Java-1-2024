package ca.nl.ca.mitchell.harvie.Assignment4;

/**
 * This class provides methods for performing calculations related to the Fibonacci sequence.
 * It includes methods for checking if a number is in the Fibonacci sequence and for
 * obtaining the nth Fibonacci number.
 */
public class FibonacciCalculator {

    /**
     * Determines if a given number is a Fibonacci number.
     *
     * @param number the number to check
     * @return true if the number is a Fibonacci number, false otherwise
     */
    public boolean isFibonacciNumber(int number) {
        int a = 0, b = 1;
        // Iterate through Fibonacci numbers until reaching or exceeding the target number
        while (a < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == number;
    }

    /**
     * Calculates the nth Fibonacci number.
     * @return the nth Fibonacci number
     */
    public int getFibonacciNumber(int n) {
        // Base cases: return n if it's 0 or 1
        if (n <= 1) return n;
        int a = 0, b = 1;
        // Compute the nth Fibonacci number, iterative
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
