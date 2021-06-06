package com.company.SchoolProblems;

import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    static int[] array = new int[10];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("insertionSort\n"+Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
