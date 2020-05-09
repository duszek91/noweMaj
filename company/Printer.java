package com.company;

public class Printer {
    private double tonerLevel =100;
    private boolean duplex;
    private double pageNumber =0;

    public Printer(double tonerLevel, boolean duplex, double pageNumber) {
        if(tonerLevel >0&& tonerLevel <=100){
        this.tonerLevel = tonerLevel;}
        this.duplex = duplex;
        this.pageNumber = pageNumber;
    }
    public void printedPage(int drukuj, boolean duplex){
        this.tonerLevel -=drukuj*0.1;
        if(this.tonerLevel <=0)
        {
            System.out.println("uzupełnij tusz");
        }else {
            if (duplex == true) {
                this.tonerLevel -=drukuj*0.1;
                System.out.println("drukuję dwustronnie");
                drukuj += drukuj;
            }
            this.pageNumber = this.pageNumber + drukuj;
            System.out.println("wydrukowałem dotej pory : "+this.pageNumber +  " stron");
 //           System.out.println("obecny stan tuszu to : " + tonerFilled +" %");
        }
    }
    public void stanTuszu()
    {
        System.out.println("obecny stan tuszu to : " + tonerLevel +" %");
    }
    public void fillToner(int fill){
        if (fill+(this.tonerLevel)>100)
        {this.tonerLevel=100;}
        else

        this.tonerLevel +=fill;

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public double getPageNumber() {
        return pageNumber;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
