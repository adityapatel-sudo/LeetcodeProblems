package com.company.SchoolProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class interleave {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter a sequence of integers separated\n" +
                "by spaces. End the sequence with the sentinel\n" +
                "value 0, followed by a return.\n\n");

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        while(true){
            int i = scanner.nextInt();
            if( i ==0 ) break;
            one.add(i);
        }

        System.out.print("Your first list: "+one+"\n\n");
        System.out.print("Please enter a sequence of integers separated\n" +
                "by spaces. End the sequence with the sentinel\n" +
                "value 0, followed by a return.\n\n");

        while(true){
            int i = scanner.nextInt();
            if( i ==0 ) break;
            two.add(i);
        }
        System.out.print("Your second list: "+two+"\n\n");

        ArrayList<Integer> interleaved = interleave(one,two);
        System.out.print("Your interleaved list: "+ interleaved+"\n");
    }
    public static ArrayList<Integer> interleave(ArrayList<Integer> one, ArrayList<Integer> two){
        ArrayList<Integer> interleaved = new ArrayList<>();
        for(int i = 0; i<Math.max(one.size(),two.size());i++){
            if(i<one.size()){
                interleaved.add(one.get(i));
            }
            if(i<two.size()){
                interleaved.add(two.get(i));
            }
        }
        return interleaved;
    }
}
