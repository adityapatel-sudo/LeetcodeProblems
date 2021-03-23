package com.company.SchoolProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class WaysToClimb {
    static int numberWays = 0;
    static ArrayList<ArrayList<Integer>> order;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs to climb (positive integer): ");
        int len = sc.nextInt();
        order = new ArrayList<>();
        recu(new ArrayList<Integer>(), len);
        System.out.println("Total number of ways = " + numberWays);
    }
    public static void recu(ArrayList<Integer> cur, int numToGo){
        if(numToGo == 0 ){
            System.out.println(cur);
            numberWays++;
            return;
        }
        if(numToGo>=1){
            cur.add(1);
            recu(cur, numToGo-1);
            cur.remove(cur.size()-1);
        }
        if(numToGo>=2){
            cur.add(2);
            recu(cur, numToGo-2);
            cur.remove(cur.size()-1);
        }
    }
}
