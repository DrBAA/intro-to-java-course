package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    protected double radius;
    protected double height;

    public Cylinder (double radius, double height) {
        this.name = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    
    @Override
    // height * PI * radius squared
    public double getArea(){
        return this.height * Math.PI * (this.radius * this.radius);
    }

    // alternative way of doing it
    // @Override
    // public double getArea(){
    //     return this.height * Math.PI * Math.pow(this.radius, 2);
    // }


}
