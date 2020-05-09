package com.company;

public class Mitsubishi extends Car {
    public Mitsubishi(String name, double cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> engined started ";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate ";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake ";
    }
}
