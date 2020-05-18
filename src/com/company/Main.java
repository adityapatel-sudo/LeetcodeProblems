package com.company;


import com.company.arrayandstring.*;
import com.company.arrays.FindAllNumbersDisappearedInAnArray;
import com.company.arrays.ThirdMaximumNumber;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        SpiralMatrix2DArray.spiralOrder(arr);
    }
}
