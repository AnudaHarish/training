package com.company;

public class Rectangle extends Shape{

    double width;
    double height;

    public Rectangle (double width, double height){
        super("Rectangle");
        this.height = height;
        this.width = width;


    }

    public void perimeter(){

        System.out.println("Perimeter " +(2 * this.width+ 2 * this.height));

    }

    public void area(){

        System.out.println("Area " +this.width * this.height);
    }

    public void properties(){
        System.out.println("properties \nwidth: " + this.width + "\nheight: " + this.height);
    }
}

