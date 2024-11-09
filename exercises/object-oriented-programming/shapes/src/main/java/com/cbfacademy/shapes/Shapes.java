package com.cbfacademy.shapes;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    
    // Utility method to round a double to 2 decimal places 
    public static double roundToTwoDecimals(double value) {
         return Math.round(value * 100.0) / 100.0; 
        
        }
    
    // Method to compute the total area of a list of Enclosure objects
    public double computeArea(List<Enclosure> enclosures) {
        double totalArea = 0;
        for (Enclosure enclosure : enclosures) {
            totalArea += enclosure.area();
        }
        return totalArea;
    }

    // Method to compute the total perimeter of a list of Enclosure objects
    public double computePerimeter(List<Enclosure> enclosures) {
        double totalPerimeter = 0;
        for (Enclosure enclosure : enclosures) {
            totalPerimeter += enclosure.perimeter();
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {

        // this list holds any objects of classes that implement the Enclosure interface.
        List<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(new Square(20));
        enclosures.add(new Square(4));
        enclosures.add(new Square(12));
        enclosures.add(new Circle(15));
        enclosures.add(new Circle(10));
        enclosures.add(new Circle(5));

        // Individually compute area and perimeter for each shape
        System.out.println("Square with width 20: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(0).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(0).perimeter()));
        System.out.println();

        System.out.println("Square with width 4: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(1).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(1).perimeter()));
        System.out.println();

        System.out.println("Square with width 12: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(2).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(2).perimeter()));
        System.out.println();

        System.out.println("Circle with radius 15: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(3).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(3).perimeter()));
        System.out.println();

        System.out.println("Circle with radius 10: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(4).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(4).perimeter()));
        System.out.println();

        System.out.println("Circle with radius 5: ");
        System.out.println("Area: " + roundToTwoDecimals(enclosures.get(5).area()));
        System.out.println("Perimeter: " + roundToTwoDecimals(enclosures.get(5).perimeter()));
        System.out.println();


        Shapes shapes = new Shapes();
        // calculate the total area and total perimeter or the square and circle shapes then round it off to 2 decimals places
        double totalArea = roundToTwoDecimals(shapes.computeArea(enclosures));
        double totalPerimeter = roundToTwoDecimals(shapes.computePerimeter(enclosures));

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
