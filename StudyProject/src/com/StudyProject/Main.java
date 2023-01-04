package com.StudyProject;
import com.assignment1.*;
import com.assignment2.*;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {
    public static void delimiter(String name) {
        System.out.println("\n---------- " + name + " ----------");
    }

    public static void main(String[] args) {

        // Assignment 1: Phone Class
        delimiter("Phone");

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("8-800-555-35-35", "OnePlus 10 Pro");
        Phone phone3 = new Phone("8-705-432-63-61", "Iphone 7", 138);

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber() + "\n");

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        // Assignment 1: Person Class
        delimiter("Person");

        Person person1 = new Person("Ibruhim");
        Person person2 = new Person("Sharan Islam", 18);

        person1.talk();
        person2.move();

        // Assignment 1: Matrix Class
        delimiter("Matrix");

        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        /*
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.setMatrix();

        If you want to test input - uncomment this ^^^
         */

        //and comment this one line VVV
        Matrix matrix1 = new Matrix(3, 3, arr);
        Matrix matrix2 = new Matrix(3, 3, arr);

        matrix2.multiplyBy(3);
        matrix1.matrixAddition(matrix2);

        matrix1.printOut();

        // Assignment 1: Readers Class
        delimiter("Readers");

        Readers reader = new Readers("Sharan Islam");
        Book[] books = new Book[4];
        books[0] = new Book("Java: The Complete Reference, 12th Edition [2021] Herbert Schildt");
        books[1] = new Book("Joshua Bloch, Effective Java (3rd) [2018]");
        books[2] = new Book("Core Java 11th edition Volume I — Fundamentals [2019] Horstmann");
        books[3] = new Book("Core Java 11th edition Volume II — Advanced Features [2019] Horstmann");

        reader.takeBook(books);
        reader.returnBook(books);

        // Assignment 1.2: Recursive output of numbers
        delimiter("Recursive");
        RecMath math = new RecMath();
        math.recursiveOutput(1, 9);
        math.recursiveOutput(5, 10);
        math.recursiveOutput(8, 2);

        // Assignment 1.2: Student and Aspirant
        delimiter("Student and Aspirant");

        Student[] students = new Student[4];
        students[0] = new Student(3.8);
        students[1] = new Aspirant(5);
        students[2] = new Student(5);
        students[3] = new Aspirant(4.9);

        for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i + 1) + " has " + students[i].getScholarship() + "$ Scholarship");
        }

        // Assignment 1.2: Animals
        delimiter("Animals");

        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];

        animals[0] = new Cat("Amity Premium", "London, Baker Street, 221B");
        animals[1] = new Dog("Royal Canin", "Los Angeles");
        animals[2] = new Horse("Be:Natu", "Dubai");

        for (int i = 0; i < 3; i++) {
            vet.treatAnimal(animals[i]);
        }
    }
}
