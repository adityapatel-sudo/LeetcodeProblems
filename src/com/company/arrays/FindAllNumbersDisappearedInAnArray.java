package com.company.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums){

            Set<Integer> set = new HashSet<Integer>();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i<nums.length;i++){
                set.add(nums[i]);
            }
            for(int i = 1; i <= nums.length; i++){
                if(!set.contains(i)){
                    list.add(i);
                }
            }



            System.out.println(list.toString());
            return list;




    }
}
