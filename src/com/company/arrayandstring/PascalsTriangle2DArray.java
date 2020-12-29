package com.company.arrayandstring;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2DArray {
    public static void generatePascalTriangle(int numRows) {
        int[] before = new int[numRows+1];
        if(numRows>0){
            before[0] = 1;
            System.out.println(before[0]);
        }
        if(numRows>1){
            int[] after = new int[numRows+1];
            after[0] = 1;
            after[1] = 1;
            if(numRows>2){
                for(int i = 2; i<=numRows;i++){
                    before = after.clone();
                    System.out.print("1 ");
                    for(int j = 1;j<i-1;j++){
                        after[j] = before[j-1]+before[j];
                        System.out.print(after[j]+" ");
                    }
                    after[i] = 1;
                    System.out.println("1");
                }
            }
        }
    }
}
