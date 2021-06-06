package com.company.SchoolProblems;

import java.util.Scanner;
import java.util.TreeSet;

public class PrintSquares {
    static int fill;
    static TreeSet<Integer> array = new TreeSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("positive integer: ");
        fill = sc.nextInt();
        recu(fill);
    }
    public static void recu(int toGo){
        if(toGo==0){
            System.out.println("unique bases: "+array);
        }else if(toGo>0) {
            for (int i = (array.size() == 0) ? 1 : array.last() + 1; i * i <= fill; i++) {
                array.add(i);
                recu(toGo - (i * i));
                array.remove(i);
            }
        }
    }
}
