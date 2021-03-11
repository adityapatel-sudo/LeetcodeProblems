package com.company.SchoolProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Permute {
    static TreeSet<String> perms = new TreeSet<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");

        recu("",scanner.next());
        for(String i : perms){
            System.out.println(i);
        }
    }
    public static void recu(String sofar, String remainingOptions){
        if(remainingOptions.length() == 0) {
            perms.add(sofar);
        }else{
            for(int i = 0; i < remainingOptions.length(); i++){
                String wo = remainingOptions.substring(0,i) + remainingOptions.substring(i+1);
                recu(sofar+remainingOptions.charAt(i),wo);
            }
        }
    }
}
