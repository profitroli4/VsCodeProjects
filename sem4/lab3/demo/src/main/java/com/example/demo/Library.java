package com.example.demo;

public class Library {
    private String name = "undefined";
    private String location = "undefined";
    private int numberOfBooks = 0;

    public Library() {}

    public Library(String name, String location, int numberOfBooks) {
        this.name = name;
        this.location = location;
        this.numberOfBooks = numberOfBooks;
    }

    public void displayInfo() {
        System.out.println("Library: " + name + ", Location: " + location + ", Books: " + numberOfBooks);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public int getNumberOfBooks() { return numberOfBooks; }
    public void setNumberOfBooks(int numberOfBooks) { this.numberOfBooks = numberOfBooks; }
}
