package pl.pp;

import java.util.List;

public class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    // Constructor
    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // Getters
    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + indexNumber + ") - Average: " + String.format("%.2f", calculateAverageGrade());
    }
}
