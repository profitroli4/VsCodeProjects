package com.example.demo;

public class Shop implements IInstitution {
    private String name;
    private String location;
    private String type;

    public Shop(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shop: " + name + ", Location: " + location + ", Type: " + type);
    }
}