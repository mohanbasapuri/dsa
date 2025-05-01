package org.dsa.arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 7};

        //Kadane's Alg_m
        int max = Integer.MIN_VALUE;
        int currSum = 0, tempStart = 0, start = 0, end = 0;

        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum > max) {
                max = currSum;
                start = tempStart;
                end = i; // always i is end of max value
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart += 1; // keeps track of next value of -ve number to restart
            }
        }

        System.out.println(max);

        for (int i = start; i <= end; i++) {
            System.out.println(a[i]);
        }
    }
}
