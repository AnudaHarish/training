package com.company;

public class Square extends Shape {

    double length;



    public Square(double length) {
        super("Square");
        this.length = length;
    }

    public void properties(){
        System.out.println("properties \nside length: " + this.length);
    }
    public void perimeter(){

        System.out.println("Perimeter " + 4 * this.length);
    }

    public void area(){
        System.out.println("Area " + this.length * this.length);
    }
}
