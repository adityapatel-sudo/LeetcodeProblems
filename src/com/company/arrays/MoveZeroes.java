package com.company.arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int zeroCounter = 0;
        int cursor =0;
        for(int dest = 0; dest < nums.length && cursor<nums.length; dest++){
            while(nums[cursor] == 0){
                if(cursor==nums.length-1){
                    break;
                }
                cursor++;
                zeroCounter++;
            }
            nums[dest] = nums[cursor];
            cursor++;


            for(int j = 0; j <nums.length; j++){
                System.out.print(nums[j]+ " ");
            }
            System.out.print( "   "+dest+" "+cursor+" "+ zeroCounter);
            System.out.println();

        }
        while(zeroCounter>0){
            nums[nums.length-zeroCounter]=0;
            zeroCounter--;

            for(int j = 0; j <nums.length; j++){
                System.out.print(nums[j]+ " ");
            }
            System.out.print( "     "+cursor+" "+ zeroCounter);
            System.out.println();
        }
    }
}
