package com.company.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr){
        for(int cursor = 0; cursor < arr.length-1; cursor++){
            for(int doubleFinder = cursor+1; doubleFinder< arr.length; doubleFinder++){
                if(arr[cursor]*2==arr[doubleFinder]||arr[doubleFinder]*2==arr[cursor]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkIfExistSets(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int cursor = 0; cursor < arr.length; cursor++){
            if(map.containsKey(arr[cursor] * 2)
                    || (map.containsKey(arr[cursor] / 2) && arr[cursor] % 2 == 0) ) {
                return true;
            }
            map.put(arr[cursor], cursor);
        }


        return false;

    }
}
