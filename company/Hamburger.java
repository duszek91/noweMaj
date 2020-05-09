package com.company;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1name;
    private double addition1Price;

    private String addition2name;
    private double addition2Price;

    private String addition3name;
    private double addition3Price;

    private String addition4name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }
public void addHamburgerAddition1(String name,double price){
        this.addition1name=name;
        this.addition1Price=price;
}
    public void addHamburgerAddition2(String name,double price){
        this.addition2name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4name=name;
        this.addition4Price=price;
    }
    public double itemizedHamburger(){
        double hamburgerPirice = this.price;
        System.out.println(this.name+" hamburger on a "+ this.breadRollType+" roll with " +this.meat+" price is "+this.price );
        if(this.addition1name!=null){
            hamburgerPirice+=this.addition1Price;
            System.out.println("Added "+this.addition1name +" for an extra "+this.addition1Price);}
        if(this.addition2name!=null) {
            hamburgerPirice += this.addition2Price;
            System.out.println("Added " + this.addition2name + " for an extra " + this.addition2Price);}
            if (this.addition3name != null) {
                hamburgerPirice += this.addition3Price;
                System.out.println("Added " + this.addition3name + " for an extra " + this.addition3Price);}
                if (this.addition4name != null) {
                    hamburgerPirice += this.addition4Price;
                    System.out.println("Added " + this.addition4name + " for an extra " + this.addition4Price);}

                return hamburgerPirice;

    }


 }
