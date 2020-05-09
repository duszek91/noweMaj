package com.company.array.ListAndArrayList.Ciagdalszy;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> grocertList = new ArrayList<String>();

    public void addGroceryItem(String item){
        grocertList.add(item);
    }

    public ArrayList<String> getGrocertList() {
        return grocertList;
    }

    public void printGroceryList(){
        System.out.println("You have " + grocertList.size()+ " items in Your grocery list");
        for (int i=0;i<grocertList.size();i++){
            System.out.println((i+1)+ ". "+grocertList.get(i));
        }
    }
    public void modifyGroceryItem(String cuttentItem,String newItem){
        int position =  findItem(cuttentItem);
        modifyGroceryItem(position,newItem);
    }
    private void modifyGroceryItem(int position , String newItem){
        grocertList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+" has been mdified. ");

    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0)
        {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String theItem=grocertList.get(position);
        grocertList.remove(position);
    }
    private int findItem(String searchItem){
        return grocertList.indexOf(searchItem);

        }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
