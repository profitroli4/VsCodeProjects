package org.example;

public class Cafe extends Institution {
    protected String specialty;

    public Cafe() {
        super("Cafe", "undefiend");
        this.specialty = "undefiend";
    }

    public Cafe(String name, String location, String specialty) {
        super(name, location);
        this.specialty = specialty;
    }

    @Override
    public void dysplayInfo() {
        super.dysplayInfo();
        System.out.println(specialty);
    }
}
