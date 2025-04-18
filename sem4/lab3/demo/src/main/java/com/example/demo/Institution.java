package com.example.demo;

public class Institution {
    private String name;
    private String location;

    public Institution() {
        this.name = "undefined";
        this.location = "undefined";
    }

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Institution: " + name + ", Location: " + location);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}