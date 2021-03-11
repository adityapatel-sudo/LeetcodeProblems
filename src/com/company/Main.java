package com.company;
import com.company.arrayandstring.PascalsTriangle2DArray;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("printStarsForLoop");
        Scanner sc = new Scanner(System.in);
        System.out.println(writeBinaryString(sc.nextInt()));

    }

    public static String writeBinaryString(int num) {
        if(num < 2)return Integer.toString(num);  // returns string representation of num
        return writeBinaryString(num/2) + writeBinaryString(num%2);  // concatenation of two strings
    }
    private static int binarySearch(long[] a,
                                     long key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return low;
    }


}
