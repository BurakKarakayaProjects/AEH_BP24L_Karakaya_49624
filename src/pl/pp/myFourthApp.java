package pl.pp;

import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Calculate sum of squares between limits");
            System.out.println("2. Simple calculator (add, subtract, multiply, divide)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    calculateSumOfSquares(scanner);
                    break;
                case 2:
                    simpleCalculator(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    public static void calculateSumOfSquares(Scanner scanner) {
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Done");
                break;
            }

            int sumOfSquares = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                sumOfSquares += i * i;
            }

            System.out.println("The sums of the squares from " + (lowerLimit * lowerLimit) + " to " + (upperLimit * upperLimit) + " is " + sumOfSquares);
        }
    }

    public static void simpleCalculator(Scanner scanner) {
        while (true) {
            System.out.println("Simple Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Return to main menu");
            System.out.print("Enter your choice: ");
            int operation = scanner.nextInt();

            if (operation == 0) {
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = getValidNumber(scanner);
            System.out.print("Enter the second number: ");
            double num2 = getValidNumber(scanner);

            switch (operation) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextDouble();
    }
}
