package com.company.MinValueChallange.rozwiązanieUdemy;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int cout = scanner.nextInt();
      //  scanner.nextInt();

        int[] returnedArray =  readIntegers(cout);
        int returnMin = findMin(returnedArray);
        System.out.println("min = " +returnMin);
    }

    private static int[] readIntegers(int count){
        int [] array=new int [count];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter a number : ");
            int number= scanner.nextInt();
            //scanner.nextInt();
            array[i]=number;
            }
        return array;
    }
private static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if (value < min) {
                min=value;
            }
        }
        return min;
}
}
