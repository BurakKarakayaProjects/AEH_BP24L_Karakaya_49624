package pl.pp;

import java.util.Scanner;

public class mySixthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the input number N
        System.out.print("Enter a number to calculate its factorial: ");
        int N = scanner.nextInt();

        // Measure the execution time for the iterative method
        long startTimeIterative = System.nanoTime();
        long factorialIterative = calculateFactorialIteratively(N);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        // Measure the execution time for the recursive method
        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = calculateFactorialRecursively(N);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        // Display the results
        System.out.println("Factorial of " + N + " (Iterative): " + factorialIterative);
        System.out.println("Execution time (Iterative): " + durationIterative + " nanoseconds");

        System.out.println("Factorial of " + N + " (Recursive): " + factorialRecursive);
        System.out.println("Execution time (Recursive): " + durationRecursive + " nanoseconds");

        scanner.close();
    }

    // Method to calculate factorial iteratively
    public static long calculateFactorialIteratively(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    public static long calculateFactorialRecursively(int N) {
        if (N == 0) {
            return 1;
        } else {
            return N * calculateFactorialRecursively(N - 1);
        }
    }
}
