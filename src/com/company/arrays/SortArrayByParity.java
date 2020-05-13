package com.company.arrays;
/*
SAMPLE ENTRY

        int[] arr= {1,3,5,7,8};
        SortArrayByParity.sortArrayByParity(arr);

 */
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int leftCursor = 0;
        int rightCursor = A.length-1;
        while(rightCursor>leftCursor){
            if(A[leftCursor] % 2 != 0 && A[rightCursor] % 2 ==0){
                int temp = A[leftCursor];
                A[leftCursor] = A[rightCursor];
                A[rightCursor] = temp;

                leftCursor++;
                rightCursor--;
            } else if(A[leftCursor] % 2 == 0 && A[rightCursor] % 2 ==0){
                leftCursor++;
            } else if(A[leftCursor] % 2 != 0 && A[rightCursor] % 2 !=0){
                rightCursor--;
            } else{
                leftCursor++;
                rightCursor--;
            }

            printArray(A);
            System.out.print( " "+leftCursor+" "+rightCursor);
            System.out.println();

        }
        return A;
    }

    public static void printArray(int[] array){
        for(int cursor = 0; cursor <array.length; cursor++){
            System.out.print(array[cursor]);
        }
        System.out.print( "   ");
    }
}
