package pl.pp;

import java.util.Scanner;

public class mySeventhApp {
    private String name;
    private int age;
    private String address;
    private int yearOfBirth;

    public mySeventhApp(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        if (this.age > 0) {
            this.age -= 1;
        }
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Year of Birth: " + this.yearOfBirth);
    }

    public static void main(String[] args) {
        mySeventhApp person = new mySeventhApp("Alice", 30, "123 Main St", 1994);
        person.display();

        // Increase age by 10 years
        person.growOld(10);
        person.display();

        // Decrease age by 1 year
        person.beYounger();
        person.display();
    }
}
