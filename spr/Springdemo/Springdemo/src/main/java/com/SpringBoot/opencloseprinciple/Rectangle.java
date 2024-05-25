package com.SpringBoot.opencloseprinciple;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }

    public static void main(String[] args) {
        Shape rec=new Rectangle(12.9,89.76);
        System.out.println(rec.area());
    }
}
