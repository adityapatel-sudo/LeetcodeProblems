package com.company.SchoolProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveInRange {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> array = new ArrayList<>();
    public static void main(String[] args){
        System.out.print("\n" +
                "Please enter an alphabetical sequence of strings separated\n" +
                "by spaces. The end of the sequence must be signified using\n" +
                "the sentinel value lastString, followed by a return.\n" +
                "\n");
        while(true){
            String temp = in.next();
            if(temp.equals("lastString")) break;
            array.add(temp);
        }
        System.out.print("Your original list: "+array+"\n\n");
        System.out.print("Now please enter your start String\n");
        String startOne = in.next();
        System.out.print("\nFinally, please enter your end String\n");
        String startTwo = in.next();

        array.removeIf(i -> checkBetween(startOne, startTwo, i));

        System.out.println("Your reduced list: "+array);
    }
    public static boolean checkBetween(String one, String two, String between){
        if(one.compareTo(between)>0)return false;
        if(two.compareTo(between)<0)return false;
        return true;
    }
}
