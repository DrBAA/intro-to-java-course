package com.cbfacademy.shapes;

public class Square implements Enclosure {
    private double width;

    // Constructor
    public Square(double width) {
        this.width = width;
    }

    // Implementing the perimeter method
    @Override
    public double perimeter() {
        return 4 * width;
    }

    // Implementing the area method
    @Override
    public double area() {
        return width * width;
    }
}
