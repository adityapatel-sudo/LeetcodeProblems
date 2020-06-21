package com.company.arrayandstring;

import java.util.Arrays;

public class ArrayPartitionOne {
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i<nums.length; i+=2){
            result += nums[i];
            if(i == nums.length - 2){
                break;
            }
        }
        return result;
    }
}
