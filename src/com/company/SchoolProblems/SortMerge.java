package com.company.SchoolProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SortMerge {
    static int[] array;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        array = new int[10];
        for (int i = 0; i < 10;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("mergeSort");
        System.out.println(Arrays.toString(array));
        mergeSort(array,10);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] full, int len) {
        if (len < 2) return;
        int mid = len / 2;
        int[] left = Arrays.copyOfRange(full,0,mid);
        int[] right = Arrays.copyOfRange(full,mid,len);
        mergeSort(left, mid);
        mergeSort(right, len - mid);
        merge(full, left, right, mid, len - mid);
    }
    public static void merge(int[] full, int[] larray, int[] rarray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (larray[i] <= rarray[j]) full[k++] = larray[i++];
            else full[k++] = rarray[j++];
        }
        while (i < left)
            full[k++] = larray[i++];
        while (j < right)
            full[k++] = rarray[j++];
    }
}
