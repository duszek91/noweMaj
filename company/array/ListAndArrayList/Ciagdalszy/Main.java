package com.company.array.ListAndArrayList.Ciagdalszy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private  static  Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice =0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice ");
            choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print List of grocery items. " );
        System.out.println("\t 2 - To add an item to the List");
        System.out.println("\t 3 - To modify an item in the List");
        System.out.println("\t 4 - To remove an item from the List.");
        System.out.println("\t 5 - To search for an item in the List");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem(){
        System.out.print("Please add the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
}
public static void modifyItem(){
    System.out.print("Enter current item name ");
    String itemNo=scanner.nextLine();

    System.out.println("Enter replacement Item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(itemNo,newItem);
}
public static void removeItem(){
    System.out.print("Enter Item name ");
    String itemNo=scanner.nextLine();

    groceryList.removeGroceryItem(itemNo);
}
public static void searchForItem(){
    System.out.println("Item to search for:");
    String searchItem = scanner.nextLine();
    if(groceryList.onFile(searchItem)){
        System.out.println("Found"+searchItem+" in our grocery List");
    }else {
        System.out.println(searchItem+" is not in the shopping list");
    }
}
public static void processArrayList(){
        ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(groceryList.getGrocertList());

    ArrayList<String> nextArray=new ArrayList<String>(groceryList.getGrocertList());
}

}
