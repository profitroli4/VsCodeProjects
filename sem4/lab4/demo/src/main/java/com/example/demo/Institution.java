package com.example.demo;

public class Institution implements IInstitution {
    private String name;
    private String location;

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void displayInfo() {
        System.out.println("Institution: " + name + ", Location: " + location);
    }
}
