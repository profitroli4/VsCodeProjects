package org.example;

public class Institution {
    protected String name;
    protected String location;

    public  Institution() {
        this.name = "undefined";
        this.location = "undefined";
    }

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void dysplayInfo() {
        System.out.println(name);
        System.out.println(location);
    }
}
