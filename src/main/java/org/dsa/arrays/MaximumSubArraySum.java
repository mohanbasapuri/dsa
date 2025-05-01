package org.dsa.arrays;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        //Works on kadane's alg_m
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max = Integer.MIN_VALUE;
        int curSum = 0, tempStart = 0, start = 0, end = 0;
        for (int i = 0; i < a.length; i++) {
           // if(6 == max) {System.out.println("found");break;}
            curSum = curSum + a[i];
            if (curSum > max) {
                max = curSum;
                start = tempStart;
                end = i;
            }

            if(curSum < 0){
                curSum = 0;
                tempStart = i + 1;
            }
        }
        System.out.println(max);

        List<Integer> subArray = Arrays.stream(a).boxed().skip(start).limit(end - start + 1).collect(Collectors.toList());
        System.out.println(subArray);
    }
}

