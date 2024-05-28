package pl.pp;

import java.util.Scanner;

public class myFifthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the character to be printed: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the number of times the character should be printed in a row: ");
        int timesInRow = scanner.nextInt();

        System.out.print("Enter the number of lines to be printed: ");
        int numberOfLines = scanner.nextInt();

        // Use the printCharacter method
        printCharacter(character, timesInRow, numberOfLines);

        scanner.close();
    }

    // Method to print the character specified number of times and lines
    public static void printCharacter(char character, int timesInRow, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < timesInRow; j++) {
                System.out.print(character);
            }
            System.out.println();  // Move to the next line after printing characters in a row
        }
    }
}
