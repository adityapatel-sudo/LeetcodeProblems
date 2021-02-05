package com.company.SchoolProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Clump {
    public static void main(String[] args){
        System.out.print("\n" +
                "Please enter a sequence of strings separated\n" +
                "by spaces. End the sequence with the sentinel\n" +
                "value \"stop\", followed by a return.\n\n");
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true){
            String i = scanner.next();
            if(i.equals("stop")) break;
            list.add(i);
        }

        System.out.print("Your original list: "+list+"\n\n");

        ArrayList<String> clumped = clump(list);

        System.out.print("Your clumped list: "+clumped+"\n");
    }
    public static ArrayList<String> clump(ArrayList<String> orig){
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 1 ; i < orig.size();i=i+2){
            temp.add("("+orig.get(i-1)+" "+orig.get(i)+")");
        }
        if(orig.size()%2==1)temp.add(orig.get(orig.size()-1));
        return temp;
    }
}
