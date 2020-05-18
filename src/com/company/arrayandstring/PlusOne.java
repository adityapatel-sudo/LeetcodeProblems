package com.company.arrayandstring;

import com.company.PrintArray;
/*
SAMPLE ENTRY
        int[] arr = new int[] {8,9,9,9};
        PlusOne.plusOne(arr);


*/

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean allNine = false;
        for(int i = 0; i < digits.length;i++){
            if(digits[i] != 9){
                break;
            }
            if(i==digits.length-1){
                allNine=true;
            }
        }
        if(allNine){
            int[] array = new int[digits.length+1];
            for(int i = 0;i<array.length;i++){
                array[i] = 0;
            }
            array[0] = 1;
            return array;
        }

        for(int i =digits.length-1; i>=0;i--){
            if(digits[i]!=9){
                digits[i] = digits[i]+1;
                break;
            }else{
                digits[i] = 0;
            }
            PrintArray.printArray(digits);
        }
        PrintArray.printArray(digits);
        return digits;
    }
}
