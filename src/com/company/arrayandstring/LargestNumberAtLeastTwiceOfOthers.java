package com.company.arrayandstring;

import com.company.PrintArray;

public class LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums){

        int maxNumber = nums[0];
        int maxNumberIndex=0;
        int secondMaxNum = nums[0];

        if(nums.length==1 && nums[0]==1){
            return 0;
        }

        for(int i =0; i<nums.length;i++){
            if (maxNumber<nums[i]){
                secondMaxNum=maxNumber;
                maxNumber = nums[i];
                maxNumberIndex =i;
            }else if (maxNumber>nums[i] && secondMaxNum<nums[i]||maxNumber==secondMaxNum){
                secondMaxNum=nums[i];
            }

            PrintArray.printArray(nums);
            System.out.print(" "+maxNumber+" "+secondMaxNum);
            System.out.println();
        }
        if(secondMaxNum*2<=maxNumber){
            System.out.println(maxNumberIndex);
            return maxNumberIndex;
        }else{
            System.out.println("-1");
            return -1;
        }

    }
}
