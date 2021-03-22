package com.company.SchoolProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static int[] array;
    public static void main(String[] args){
        array = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10;i++){
            array[i] = sc.nextInt();
        }
        selectionSort();
        System.out.println();
    }
    public static void selectionSort(){
        System.out.println("selectionSort");
        System.out.println(Arrays.toString(array));
        int smallest;
        int smallestIndex=0;
        for(int i = 0; i < array.length-1;i++){
            smallest = Integer.MAX_VALUE;
            for(int j = i ; j < array.length;j++){
                if(array[j] < smallest){
                    smallest = array[j];
                    smallestIndex = j;
                }
            }
            swap(i,smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
    public static void swap(int one, int two){
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
