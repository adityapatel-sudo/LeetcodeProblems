package com.company.arrays;

import com.company.PrintArray;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {

        int maxNumber = nums[0];
        int secondMaxNum = nums[0];
        int thirdMaxNum = nums[0];


        for(int i =0; i<nums.length;i++){
            if (maxNumber<nums[i]){
                thirdMaxNum=secondMaxNum;
                secondMaxNum=maxNumber;
                maxNumber = nums[i];
            }else if (maxNumber>nums[i] && secondMaxNum<nums[i]||maxNumber==secondMaxNum){
                thirdMaxNum=secondMaxNum;
                secondMaxNum=nums[i];
            }else if (secondMaxNum>nums[i] && thirdMaxNum<nums[i]||maxNumber ==thirdMaxNum||secondMaxNum==thirdMaxNum){
                thirdMaxNum=nums[i];
            }

            PrintArray.printArray(nums);
            System.out.print(" "+maxNumber+" "+secondMaxNum+" "+thirdMaxNum);
            System.out.println();
        }
        if(maxNumber==secondMaxNum||secondMaxNum==thirdMaxNum||maxNumber==thirdMaxNum){
            System.out.println(maxNumber);
            return maxNumber;
        }
        System.out.println(thirdMaxNum);
        return thirdMaxNum;
    }
}
