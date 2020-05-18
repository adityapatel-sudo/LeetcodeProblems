package com.company.arrayandstring;

public class FindPivotIndex {
    /*
    SAMPLE
        int[] arr = new int[] {1, 7, 3, 6, 5, 6};
        FindPivotIndex.pivotIndex(arr);



i did this in one try.
    */
    public static int pivotIndex(int[] nums) {
        int pivot = -1;
        int leftInts=0;
        int rightInts=0;
        for(int i =0;i<nums.length;i++){
            rightInts = rightInts+nums[i];
            System.out.println(rightInts);
        }


        for(int cursor = 0; cursor<nums.length; cursor++){
            rightInts = rightInts-nums[cursor];
            if(cursor>0){
                leftInts=leftInts+nums[cursor-1];
            }
            if(leftInts==rightInts){
                pivot = cursor;
                System.out.println(pivot);
                return pivot;
            }
        }
        System.out.println(pivot);
        return pivot;
    }
}
