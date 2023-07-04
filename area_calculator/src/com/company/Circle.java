package com.company;

public class Circle extends Shape {

    double radius;


    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    public void area(){

        System.out.println("Area " +this.radius * this.radius * Math.PI);
    }
    public void perimeter(){

        System.out.println("Perimeter " + 2 * Math.PI * this.radius);
    }

    public void properties(){
        System.out.println("properties \nradius: " + this.radius);
    }
}
