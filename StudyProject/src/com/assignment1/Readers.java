package com.assignment1;

public class Readers {

    private String fullName = " -There's no name. Please, set it- ";
    private String cardNumber = " -There's no card number. Please, set it- ";
    private String faculty = " -There's no faculty. Please, set it- ";
    private String dateOfBirth = " -There's no date of birth. Please, set it- ";
    private String phoneNumber = " -There's no phone number. Please, set it- ";

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            if (i != books.length - 1) System.out.print(books[i] + ", ");
            else System.out.print(books[i] + ".\n");
        }
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i < books.length; i++) {
            if (i != books.length - 1) System.out.print(books[i].getNameOfBook() + ", ");
            else System.out.print(books[i].getNameOfBook() + ".\n");
        }
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            if (i != books.length - 1) System.out.print(books[i] + ", ");
            else System.out.print(books[i] + ".\n");
        }
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " returned books: ");
        for (int i = 0; i < books.length; i++) {
            if (i != books.length - 1) System.out.print(books[i].getNameOfBook() + ", ");
            else System.out.print(books[i].getNameOfBook() + ".\n");
        }
    }

    public Readers() {}

    public Readers(String fullName) {
        this.fullName = fullName;
    }

    public Readers (String fullName, String cardNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
    }

    public Readers(String fullName, String cardNumber, String faculty) {
        this(fullName, cardNumber);
        this.faculty = faculty;
    }

    public Readers(String fullName, String cardNumber, String faculty, String dateOfBirth) {
        this(fullName, cardNumber, faculty);
        this.dateOfBirth = dateOfBirth;
    }

    public Readers(String fullName, String cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this(fullName, cardNumber, faculty, dateOfBirth);
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


