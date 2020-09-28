package com.company;

import java.util.Scanner;

public class mainSchool {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numString = console.nextInt();
        System.out.println();

        addStrings(numString, console);
    }

    public static void addStrings(int numOfStrings, Scanner console) {
        int total = 0;
        for(int i = 0; i < numOfStrings; i++){
            total += addASCII(console.next());
        }
        System.out.println(total);
    }
    public static int addASCII(String string){
        int total = 0 ;
        for(int i = 0; i < string.length(); i++){
            total += string.charAt(i);
        }
        return total;
    }

}
