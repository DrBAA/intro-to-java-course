package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("blue", "Volvo", "V40", 2012));
        cars.add(new Car("red", "Porsche Panamera", "V40", 2009));
        cars.add(new Car("grey", "Audi", "A3", 2018));
        return cars;
    }

}
