package com.company.SchoolProblems;

import java.net.Inet4Address;
import java.util.Scanner;

public class WriteBinaryString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        System.out.println("Binary expression: "+recu(sc.nextInt()));
    }
    public static String recu(int soFar){
        if(soFar<2)
            return Integer.toString(soFar);
        else
            return recu(soFar%2)+recu(soFar/2);
    }
}
