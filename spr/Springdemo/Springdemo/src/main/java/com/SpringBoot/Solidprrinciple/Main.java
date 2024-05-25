package com.SpringBoot.Solidprrinciple;

public class Main {
    public static void main(String[] args) {
        BookSingleesponsibility book=new BookSingleesponsibility("Harry porter",1987);
        BookPrrinter bp=new BookPrrinter();
        bp.printBook(book);
    }
}
