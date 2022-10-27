package com.company.arrays;
// https://leetcode.com/problems/find-pivot-index/
public class pivot {
    public static void main(String[] args){
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }
    public static int pivotIndex(int[] nums) {
        for(int i = 1 ; i < nums.length;i++){
            nums[i] += nums[i-1];
        }
        if(0 == nums[nums.length-1]-nums[0])
            return 0;
        for(int i = 1 ; i < nums.length;i++) {
            if(nums[i-1] == nums[nums.length-1]-nums[i])
                return i;
        }
        return -1;
    }
}
