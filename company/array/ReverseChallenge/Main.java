package com.company.array.ReverseChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of array lenght : ");
        int iloscLiczb = scanner.nextInt();
        int[] myInteger = getInteger(iloscLiczb);
       printTablica(myInteger);
//        printReversTablica(myInteger);


    }

    public static int[] getInteger(int iloscLiczb) {
        int[] tablica = new int[iloscLiczb];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbą :" + (i + 1) + " do tablicy");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public static void printTablica(int[] tablica) {
        int b=0;
        for (int i = 0; i < tablica.length ; i++) {
            b++;
            System.out.println("Liczba :" + (i + 1) + " wynosi "+ tablica[i]);
        }if(b ==tablica.length){
            printReversTablica(tablica);
        }

    }

    public static void printReversTablica(int[] tablica) {
        for (int i = tablica.length; i !=0; i--) {
            System.out.println("Liczba :" + (i ) + " wynosi "+ tablica[i-1]);
        }
    }
}