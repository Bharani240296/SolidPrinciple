package com.SpringBoot.Solidprrinciple;

public class BookSingleesponsibility {
    private String name;
    private int year;

    public BookSingleesponsibility(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
