package com.company;

/*

        int[][] arr;
        arr = new int[3][3];
        arr[0][0]=0;
        arr[0][1]=1;
        arr[1][0]=2;
        arr[1][1]=3;

        Print2DArray.PrintArray(arr);

*/


public class Print2DIntArray {
    public static void PrintArray(int[][] array){
        int row = array.length;
        int column = array[0].length;
        for(int i =0;i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
}
