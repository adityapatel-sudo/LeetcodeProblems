package com.company.arrays;
/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1">link</a>
 * **/
public class runningSum {
    public int[] runningSum(int[] nums) {
        int[] rSum = new int[nums.length];
        rSum[0] = nums[0];
        for(int i = 1; i < nums.length ; i++) {
            rSum[i] = nums[i] +rSum[i-1];
        }
        return rSum;
    }
}
