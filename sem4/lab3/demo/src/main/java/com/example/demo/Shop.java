package com.example.demo;

public class Shop {
    private String name = "undefined";
    private String location = "undefined";
    private String type = "undefined";

    public Shop() {}

    public Shop(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Shop: " + name + ", Location: " + location + ", Type: " + type);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
