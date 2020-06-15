package com.company.arrayandstring;

import com.company.PrintArray;

public class ReverseString {
    public static char[] reverseString(char[] s){
        int j = 0;
        int k = s.length-1;

        PrintArray.printArray(s);
        System.out.println();


        while(j<k){
            char temp = s[j];
            s[j]=s[k];
            s[k]=temp;
            j++;
            k--;
            PrintArray.printArray(s);
            System.out.println();

        }
        PrintArray.printArray(s);
        System.out.println();

        System.out.println("DONE");
        return s;
    }
}
