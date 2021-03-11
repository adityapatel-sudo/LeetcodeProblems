package com.company.SchoolProblems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for(int i = 0 ; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        System.out.println(binarySearch(array,search));
    }
    public static int binarySearch(int[] array, int search){
        int low = 0, high = array.length-1, mid;
        while(low<high){
            mid = (low+high)/2;
            if(array[mid]==search) return mid;
            else if (array[mid]<search) low = mid +1;
            else high = mid-1;
        }
        return -1;
    }
}
