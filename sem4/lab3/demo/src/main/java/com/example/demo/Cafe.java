package com.example.demo;

public class Cafe {
    private String name = "undefined";
    private String location = "undefined";
    private String specialty = "undefined";

    public Cafe() {}

    public Cafe(String name, String location, String specialty) {
        this.name = name;
        this.location = location;
        this.specialty = specialty;
    }

    public void displayInfo() {
        System.out.println("Cafe: " + name + ", Location: " + location + ", Specialty: " + specialty);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
}
