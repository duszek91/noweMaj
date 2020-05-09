package com.company;

public class Fiat extends Car {
    public Fiat(String name, double cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Fiat -> engined started ";
    }

    @Override
    public String accelerate() {
        return "Fiat -> accelerate ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" -> brake ";
    }
}
