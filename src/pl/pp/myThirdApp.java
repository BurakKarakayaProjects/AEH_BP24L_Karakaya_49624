package pl.pp;

import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Convert days to weeks and days");
            System.out.println("2. Convert Celsius to Fahrenheit and Kelvin");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    convertDaysToWeeks(scanner);
                    break;
                case 2:
                    convertTemperature(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    public static void convertDaysToWeeks(Scanner scanner) {
        int days;

        while (true) {
            System.out.print("Please enter the number of days (enter a non-positive number to exit): ");
            days = scanner.nextInt();

            if (days <= 0) {
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
        }
    }

    public static void convertTemperature(Scanner scanner) {
        double celsius;

        while (true) {
            System.out.print("Please enter the temperature in Celsius (enter -1 to exit): ");
            celsius = scanner.nextDouble();

            if (celsius == -1) {
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f%n", celsius, fahrenheit, kelvin);
        }
    }
}




























/*package pl.pp;
import java.util.Scanner;
public class myThirdApp {
 public static void main(String[] args) {
 //this is a line comment
 /*
 This is a block comment
it can have multiple lines
just like here

     double x = 10;
     double doubleX = x * 2;
     double xSquared  = x * x;
     System.out.println("x = " + x);
     System.out.println("The double of x = " + doubleX);
     System.out.println("The value of x squared = " + xSquared);
     // creating a double type variable and assigning it a value of 10
     double y = 2;
     Scanner scanner = new Scanner(System.in);
     var result = x + y;
     System.out.println("x + y = " + result);
     result = x - y;
     System.out.println("x - y = " + result);
     result = x * y;
     System.out.println("x * y = " + result);
     result = x / y;
     System.out.println("x / y = " + result);
     result = x % y;
     System.out.println("x % y = " + result);
     System.out.println("Enter two numbers separated by the Enter key:");
     result = x * x;
     System.out.println("x + y = " + result);
     double first = scanner.nextDouble(); //reguest to enter a double value
     double second = scanner.nextDouble();
     System.out.println("x + y = " + (first + second));
      System.out.println("Please enter your name:");
      String forename = scanner.nextLine();
      System.out.println("Please enter your surname:");
      String surname = scanner.nextLine();
      System.out.print("Please enter your age in years: ");
      int ageInYears = scanner.nextInt();
      int secondsInMinute = 60;
      int minutesInHour = 60;
      int hoursInDay = 24;
      int daysInYear = 365;
      long ageInSeconds = (long) ageInYears * daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        // Display the age in seconds with a proper description
      System.out.println("My age in seconds: " + ageInSeconds);
      scanner.close();
      System.out.println("Welcome " + forename + " " + surname);
 }
} */
