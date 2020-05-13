package com.company.arrays;

    /*
        SAMPLE ENTRY

        int[] nums1 = new int[]{2,7,8,0,0};
        int m = 3;
        int[] nums2 = new int[]{1,3};
        int n = 2;
        MergeSortedArray.merge(nums1, m, nums2, n);
     */

public class MergeSortedArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int dest = nums1.length-1;
        m--;
        n--;

        for (int k = 0; k < nums1.length; k++) {
            System.out.print(nums1[k]);
        }
        System.out.print(",");
        for (int k = 0; k < nums2.length; k++) {
            System.out.print(nums2[k]);
        }
        System.out.print("," + m + "," + n + "," + "0    ");


        if (nums1.length == nums2.length) {
            for (int i = nums1.length - 1; i >= 0; i--) {
                nums1[i] = nums2[i];

                for (int k = 0; k < nums1.length; k++) {
                    System.out.print(nums1[k]);
                }
                System.out.print(",");
                for (int k = 0; k < nums2.length; k++) {
                    System.out.print(nums2[k]);
                }
                System.out.print("," + m + "," + n + "," + i + "    ");
            }
        }


        if (nums1.length > nums2.length) {
            for (int i = nums1.length - 1; i > m; i--, dest--) {
                if (m < 0 || n < 0) {

                    break;
                }


                if (nums2[n] < nums1[m]) {
                    nums1[i] = nums1[m];
                    m--;

                } else if (nums2[n] >= nums1[m]) {
                    nums1[i] = nums2[n];
                    n--;
                }


                for (int k = 0; k < nums1.length; k++) {
                    System.out.print(nums1[k]);
                }
                System.out.print(",");
                for (int k = 0; k < nums2.length; k++) {
                    System.out.print(nums2[k]);
                }
                System.out.print("," + m + "," + n + "," + i + "    ");

            }
        }
        while (n >= 0) {
            nums1[dest--] = nums2[n--];
            for (int k = 0; k < nums1.length; k++) {
                System.out.print(nums1[k]);
            }
            System.out.print(",");
            for (int k = 0; k < nums2.length; k++) {
                System.out.print(nums2[k]);
            }
            System.out.print("," + m + "," + n + ","  + "end    ");
        }

    }

}
