package com.example.demo;

public class Cafe implements IInstitution {
    private String name;
    private String location;
    private String specialty;

    public Cafe(String name, String location, String specialty) {
        this.name = name;
        this.location = location;
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Cafe: " + name + ", Location: " + location + ", Specialty: " + specialty);
    }
}