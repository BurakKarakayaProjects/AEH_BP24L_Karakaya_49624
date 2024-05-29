package pl.pp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EleventhApp {
    public static void main(String[] args) {
        // Load student data
        List<Student> students = Arrays.asList(
            new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
            new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
            new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
            new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Find the student with the highest average grade
        Optional<Student> highestAverageStudent = students.stream()
                .max(Comparator.comparingDouble(Student::calculateAverageGrade));

        // Calculate the average grade of all students
        double totalSum = students.stream()
                .mapToDouble(Student::calculateAverageGrade)
                .sum();
        double overallAverage = totalSum / students.size();

        // Print the student with the highest average grade
        highestAverageStudent.ifPresent(student -> System.out.println("Student with the highest average: " + student));

        // Sort students by last names and print them
        System.out.println("\nStudents sorted by last names:");
        students.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .forEach(System.out::println);

        // Print overall average grade
        System.out.println("\nOverall average grade of all students: " + String.format("%.2f", overallAverage));
    }
}
