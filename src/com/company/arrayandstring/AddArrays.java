package com.company.arrayandstring;

import org.jetbrains.annotations.NotNull;

public class AddArrays {
    public static int @NotNull [] addArrays(int[] one, int[] two){
        int num = arrayToInt(one) + arrayToInt(two);
        String temp = Integer.toString(num);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++){
            array[i] = temp.charAt(i);
        }
        return array;
    }
    public static int arrayToInt(int[] array){
        int num = 0;
        int multiple = (int) Math.pow(10,array.length-1);
        for(int i = 0; i< array.length; i++){
            num += (array[i] * multiple);
            multiple = multiple/10;
        }
        return num;
    }
}
