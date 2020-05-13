package com.company.arrays;

public class ValidMountainArray {


    public static boolean validMountainArray(int[] A){
        int savedInt = 0;
        if (A.length < 3){
            return false;
        }
        for(int cursor = 0; cursor<A.length; cursor++){
            if (A[cursor] == A[cursor+1]){
                return false;
            }else if(A[cursor] > A[cursor+1]){
                savedInt = cursor;
                break;
            }
        }

        for(int cursor = savedInt; cursor<A.length; cursor++){
            if (A[cursor] == A[cursor+1]){
                return false;
            }else if(A[cursor] < A[cursor+1]){
                return false;
            }
        }
        return true;
    }
}
