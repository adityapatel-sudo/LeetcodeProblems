package com.company.arrays;

    /*
    SAMPLE ENTRY
        int[] chums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray.removeDuplicates(chums);
     */

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int dest = 0;
        for(int cursor = 0; cursor<nums.length; cursor++){
            if(nums[cursor] > nums[dest]){
                nums[dest+1] = nums[cursor];
                dest++;
            }
            RemoveDuplicatesFromSortedArray.printArray(nums);
            System.out.print(cursor+"  "+dest+"  ");
        }
        return dest+1;
    }
    public static void printArray(int[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]);
        }
        System.out.print( "   ");
    }
}
