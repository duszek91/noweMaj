package com.company.MinValueChallange;

import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj liczbę cyfr jaką chcesz wpisać ");
        int iloscLiczb = scanner.nextInt();
        int[] myInteger = getInteger(iloscLiczb);
        int [] minValue = findMin(myInteger);
        printMin(minValue);

    }

    public static int[] getInteger(int iloscLiczb){
        int[] tablica = new int [iloscLiczb];

        for (int i=0; i<tablica.length;i++){
            System.out.println("Podaj : "+ (i+1) + " liczbe do tablicy ");
            tablica[i]= scanner.nextInt();
        }
        return tablica;
    }
    public static int[] findMin(int[]tablica){
        int[] findMin = new int [tablica.length];
        for (int i =0; i<tablica.length;i++){
            findMin[i]=tablica[i];

        }
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<findMin.length-1;i++){
                if(findMin[i]<findMin[i+1]){
                    temp=findMin[i];
                    findMin[i]=findMin[i+1];
                    findMin[i+1]=temp;
                    flag=true;
                }
            }
        }
        return findMin;

    }
    public static void printMin(int[]tablica){
        System.out.println("Min value is :"+tablica[tablica.length-1] );
    }

}
