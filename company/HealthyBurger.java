package com.company;

public class HealthyBurger extends  Hamburger{
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healty", "Brown rye", meat, price);

    }
    public void addHealthyAddition1(String name, double price){
        this.healtyExtra1Name=name;
        this.healtyExtra1Price=price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healtyExtra2Name=name;
        this.healtyExtra2Price=price;
    }

    @Override
    public double itemizedHamburger() {
      double hamburgerPrice =  super.itemizedHamburger();
      if(this.healtyExtra1Name!=null){
            hamburgerPrice += this.healtyExtra1Price;
            System.out.println("Added " + this.healtyExtra1Name + " for an extra "+this.healtyExtra1Price);
        }
        if(this.healtyExtra2Name!=null){
            hamburgerPrice += this.healtyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name + " for an extra "+this.healtyExtra2Price);
        }
        return hamburgerPrice;
    }
}
