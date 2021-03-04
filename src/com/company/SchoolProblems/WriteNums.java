package com.company.SchoolProblems;

import java.util.Scanner;
import java.util.*;

public class WriteNums {
    static int[] array;
    static int size;
    public static void main(String[] args){
        getArrayAndPrintSum();
    }

    private static void getArrayAndPrintSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of integer array: ");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter n integers separated by spaces: ");
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The sum of the elements in your list: "+recu(0,0));
    }

    public static int recu(int cur,int sum){
        if(cur>=size) return sum;
        else return recu(cur+1, sum + array[cur]);
    }
}
