package org.example;

public class Shop extends Institution {
    protected String type;

    public Shop() {
        super("Shop", "undefiend");
        this.type = "undefiend";
    }

    public Shop(String name, String location, String type) {
        super(name, location);
        this.type = type;
    }

    @Override
    public void dysplayInfo() {
        super.dysplayInfo();
        System.out.println(type);
    }
}
