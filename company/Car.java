package com.company;

public class Car {
    private String name;
    private boolean engine;
    private double cylinders;
    private  double wheels;


    public Car(String name, double cylinders) {
        this.name="Samochód";
        this.engine=true;
        this.cylinders = cylinders;
        this.wheels=4;

    }

    public String getName() {
        return name;
    }

    public double getCylinders() {
        return cylinders;
    }

    public String startEngine(){
      return "The Cars engined started ";
    }
    public String  accelerate()
    {
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
