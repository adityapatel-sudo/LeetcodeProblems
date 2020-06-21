package com.company.arrayandstring;

import java.util.HashMap;

public class TwoSumTwo {
    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];

        //create and fill map
        HashMap<Integer, Integer> hashMap = new HashMap();
        for(int i = 0; i<numbers.length ; i++){
            hashMap.put(numbers[i], i);
        }
        //search for pairs
        for(int i = 0; i < numbers.length; i++){
            int inum = target - numbers[i];
            if(hashMap.containsKey(inum)){
                result[0] = i+1;
                result[1] = hashMap.get(inum)+1;
                return result;
            }
        }
        return null;
    }
}
