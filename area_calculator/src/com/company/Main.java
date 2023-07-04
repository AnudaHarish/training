package com.company;
import java.util.*;
public class Main {





    public static void main(String[] args) {








        Shape shape = null;

        System.out.println("Calculating the perimeter and the area ");
        Scanner sc = new Scanner(System.in);
        System.out.println("  1 - circle \n  2 - square \n  3 - rectangle" );
        System.out.println("Select the number for the given shape ");

        int num =sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.println("Enter the side length of the square: ");
                double length =  sc.nextDouble();
                shape  = new Square(length);
                break;
            case 3:
                System.out.println("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Enter the height of the rectangle: ");
                double height = sc.nextDouble();
                shape  = new Rectangle(width,height);
                break;
            default:
                System.out.println("Enter a valid number from the menu");
                break;



        }


        if(shape != null){

            System.out.println("Shape: " + shape.name);
            shape.properties();
            shape.area();
            shape.perimeter();
        }





    }
}
