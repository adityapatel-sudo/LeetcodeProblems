package com.company.arrays;

public class RemoveElementFromArray {
    public static int removeNum(int[] nums, int val){

        /*
        SAMPLE ENTRY
        int[] array = {0,1,2,2,3,0,4,2};
        int remove = 2;
        RemoveElementFromArray.removeNum(array, remove);
         */


        int dest = 0;
        for(int cursor = 0; cursor < nums.length; cursor++){
            if (nums[cursor] != val){
                nums[dest] = nums[cursor];
                dest++;
            }
            RemoveElementFromArray.printArray(nums);
            System.out.print(dest+" "+cursor+"   ");
        }

        return dest;
    }

    public static void printArray(int[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]);
        }
        System.out.print( "   ");
    }
}
