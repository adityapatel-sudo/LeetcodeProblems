package com.company.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int differenceCounter=0;
        int[] sortedHeights = new int[heights.length];
        for(int i = 0; i<heights.length; i++){
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights);

        for(int i=0;i<heights.length;i++){
            if(heights[i] != sortedHeights[i]){
                differenceCounter++;
            }
        }
        System.out.print(differenceCounter);
        return differenceCounter;
    }
}
