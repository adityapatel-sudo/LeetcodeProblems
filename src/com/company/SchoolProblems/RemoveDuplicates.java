package com.company.SchoolProblems;

import java.util.*;

public class RemoveDuplicates {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> array;
    public static void main(String[] args){
        array = new ArrayList<>();
        askInput();
        System.out.println("\nYour original list: "+array.toString()+"\n");

        for(int i = 0; i< array.size()-1;i++){
            for(int j = i+1;j<array.size();){
                if(array.get(j).equalsIgnoreCase(array.get(i))){
                    array.remove(j);
                }else break;
            }
        }
        System.out.println("Your list with duplicates removed: "+array.toString()+"\n");
    }
    public static void askInput(){
        System.out.println("\nPlease enter an alphabetical sequence of strings separated\n" +
                "by spaces. The end of the sequence must be signified using\n" +
                "the sentinel value lastString, followed by a return.\n");
        String temp = "";
        while (in.hasNext()){
            temp = in.next();
            if(temp.equals("lastString"))return;
            else array.add(temp);
        }
    }
}
