package org.example;

public class Library extends Institution {
    protected int booksCounter;

    public Library() {
        super("Library", "undefiend");
        this.booksCounter = 0;
    }

    public Library(String name, String location, int booksCounter) {
        super(name, location);
        if (booksCounter < 0)
            throw new RuntimeException("Количество книг не может быть отрицательным");
        else this.booksCounter = booksCounter;
    }

    @Override
    public void dysplayInfo() {
        super.dysplayInfo();
        if (booksCounter == 0)
            System.out.println("Библиотека пуста");
        else System.out.println(booksCounter);
    }
}
