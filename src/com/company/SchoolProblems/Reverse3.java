package com.company.SchoolProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse3 {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<>();
    public static void main(String[] args){
        System.out.print("\n" +
                "Please enter a sequence of integers separated\n" +
                "by spaces. End the sequence with the sentinel\n" +
                "value 0, followed by a return.\n" +
                "\n");
        while(true){
            int temp = in.nextInt();
            if(temp==0) break;
            array.add(temp);
        }

        System.out.print("Your original list: "+array+"\n\n");

        for(int i =2; i<array.size();i=i+3){
            int temp = array.get(i);
            array.set(i, array.get(i-2));
            array.set(i-2,temp);
        }

        System.out.println("Your reversed3 list: "+array);
    }
}
