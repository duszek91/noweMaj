package com.company;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("delux", "White" , "Sosage & Bacon", 9.99);
        super.addHamburgerAddition1("Chips",2.64);
        super.addHamburgerAddition2("Drink",2);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a delux burger");
    }
}
