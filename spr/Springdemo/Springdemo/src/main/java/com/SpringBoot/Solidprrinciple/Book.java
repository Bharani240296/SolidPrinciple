package com.SpringBoot.Solidprrinciple;
//without srp
public class Book {
    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void prrint()
    {
        System.out.println("Name; "+name);
        System.out.println("year; "+ (year));
    }

    public static void main(String[] args) {
        Book book=new Book("Harry poter",1989);
        book.prrint();
    }
}
