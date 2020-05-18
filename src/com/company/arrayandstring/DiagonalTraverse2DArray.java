package com.company.arrayandstring;

import com.company.Print2DArray;
import com.company.PrintArray;

public class DiagonalTraverse2DArray {
    public static int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length==0){
            return new int[0];
        }

        int row = 0;
        int column = 0;

        int maxRows= matrix.length;
        int maxColumns = matrix[0].length;

        int[] diagonalOrder = new int[maxRows*maxColumns];
        int cursor = 0;
        boolean UR = true;

        Print2DArray.PrintArray(matrix);

        while(cursor<diagonalOrder.length){
            diagonalOrder[cursor] = matrix[row][column];
            cursor++;

            PrintArray.printArray(diagonalOrder);
            System.out.println("Row:"+row+"  Column:"+column+"   MaxRows:"+maxRows+"  MaxColumns:"+maxColumns);

            if(UR){
                if(row>0 && column<maxColumns-1) {
                    row--;
                    column++;
                }else if (column == maxColumns-1){
                    row++;
                    UR = false;
                }else if (row == 0){
                    column++;
                    UR = false;
                }
            }else{
                if(row<maxRows-1 && column>0){
                    row++;
                    column--;
                }else if(row == maxRows-1){
                    column++;
                    UR = true;
                }else if(column==0){
                    row++;
                    UR = true;
                }
            }
        }
        return diagonalOrder;
    }
}
