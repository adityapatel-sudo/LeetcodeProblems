package com.company.arrays;

public class PrintArray {
    public static void printArray(int[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]);
        }
        System.out.print( "   ");
    }
}
