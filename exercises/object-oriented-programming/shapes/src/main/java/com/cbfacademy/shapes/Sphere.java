package com.cbfacademy.shapes;

public class Sphere extends Shape {

protected double radius;

    // constructor Sphere (double radius)
    public Sphere (double radius) {
       this.name = "Sphere";
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4 * Math.PI * (radius*radius);
    }

    // alternative way of doing it
    // @Override
    // public double getArea(){
    //     return 4 * Math.PI * Math.pow(radius, 2);
    // }

    
}

