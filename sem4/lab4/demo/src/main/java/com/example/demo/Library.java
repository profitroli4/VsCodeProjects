package com.example.demo;

public class Library implements IInstitution {
    private String name;
    private String location;
    private int numberOfBooks;

    public Library(String name, String location, int numberOfBooks) {
        this.name = name;
        this.location = location;
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public void displayInfo() {
        System.out.println("Library: " + name + ", Location: " + location + ", Books: " + numberOfBooks);
    }
}
