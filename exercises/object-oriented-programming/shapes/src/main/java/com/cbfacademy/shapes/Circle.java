package com.cbfacademy.shapes;

public class Circle implements Enclosure {

    double radius;
  
    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    };

    @Override
    public double area(){
        return 2 * Math.PI * radius * radius;
    }

}
