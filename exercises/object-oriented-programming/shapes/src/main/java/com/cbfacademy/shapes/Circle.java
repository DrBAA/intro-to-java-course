package com.cbfacademy.shapes;

public class Circle implements Enclosure {

    double radius;
  
    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return perimeter;        
    };

    @Override
    public double area(){
        return area;
    }


}
