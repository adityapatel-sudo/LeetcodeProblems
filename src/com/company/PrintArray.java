package com.company;

public class PrintArray {
    public static void printArray(int[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.println(array[cursor]);
        }
    }
    public static void printArray(String[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]+" ");
        }

    }
    public static void printArray(char[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]+" ");
        }
    }

}
