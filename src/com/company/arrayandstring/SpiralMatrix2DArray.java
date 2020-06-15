package com.company.arrayandstring;

import com.company.PrintArray;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/*

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

*/

public class SpiralMatrix2DArray {
    public static List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length==0){
            return new ArrayList<>();
        }

        List<Integer> spiralOrder = new ArrayList<Integer>();
        int northEdge = 0;
        int eastEdge = matrix[0].length-1;
        int southEdge = matrix.length-1;
        int westEdge = 0;

        int row = 0;
        int column = 0;

        int direction = 1;

        while(spiralOrder.size()<matrix.length*matrix[0].length){
            spiralOrder.add(matrix[row][column]);

            System.out.println(spiralOrder.toString() +"   Row:"+row+"  Column:"+column+"   northEdge:"+northEdge+"  eastEdge:"+eastEdge+"   southEdge:"+southEdge+"  westEdge:"+westEdge);

            if(direction ==0){
                if(row>northEdge){
                    row--;
                }else{
                    column++;
                    direction=1;
                    westEdge++;
                }
            }else if(direction == 1){
                if(column<eastEdge){
                    column++;
                }else {
                    row++;
                    direction=2;
                    northEdge++;
                }
            }else if(direction == 2){
                if(row<southEdge){
                    row++;
                }else{
                    column--;
                    direction=3;
                    eastEdge--;
                }
            }else if(direction == 3){
                if(column>westEdge){
                    column--;
                }else{
                    row--;
                    direction=0;
                    southEdge--;
                }
            }
        }
        return spiralOrder;
    }
}
