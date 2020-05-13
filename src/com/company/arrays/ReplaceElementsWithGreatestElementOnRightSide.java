package com.company.arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int largestNum = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        for(int cursor = arr.length-2; cursor>=0; cursor--){

            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("  "+cursor+"  "+largestNum);
            System.out.println();


            if(arr[cursor] > largestNum) {
                int temp = largestNum;
                largestNum = arr[cursor];
                arr[cursor] = temp;
            }else{
                arr[cursor] = largestNum;
            }

        }

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        return arr;
    }
}
