package com.company.arrayandstring;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2DArray {
    public static List<List<Integer>> generatePascalTriangle(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if(numRows>0){
            pascalTriangle.add(new ArrayList<Integer>());
            pascalTriangle.get(0).add(1);

            System.out.println(pascalTriangle.get(0));
        }
        if(numRows>1){
            pascalTriangle.add(new ArrayList<Integer>());
            pascalTriangle.get(1).add(1);
            pascalTriangle.get(1).add(1);

            System.out.println(pascalTriangle.get(1));
        }
        if(numRows>2){
            for(int cursorList = 2; cursorList<numRows;cursorList++){

                List<Integer> rowi = new ArrayList<>();
                rowi.add(1);
                for(int cursorInt = 1; cursorInt < cursorList; cursorInt++){
                    rowi.add(cursorInt,pascalTriangle.get(cursorList-1).get(cursorInt-1)+pascalTriangle.get(cursorList-1).get(cursorInt));
                }
                rowi.add(1);
                System.out.println(rowi);
                pascalTriangle.add(rowi);
            }
        }

        return pascalTriangle;
    }
}
