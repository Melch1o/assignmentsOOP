package com.assignment1;

public class Book {

    private String nameOfBook;
    private String authorOfBook;

    public Book() {}

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
}
