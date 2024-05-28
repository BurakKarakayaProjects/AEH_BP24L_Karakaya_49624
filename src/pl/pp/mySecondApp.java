package pl.pp;
import java.util.Scanner;
public class mySecondApp {
 public static void main(String[] args) {
 //this is a line comment
 /*
 This is a block comment
it can have multiple lines
just like here
 */
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
}
