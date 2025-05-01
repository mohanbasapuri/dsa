package org.dsa.arrays;

import java.util.Arrays;

public class MoveZerosWithOutOrder {
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1};

        int zeros = 0, ones = 0;
        for (int num : a) {
            if (num == 0)
                zeros++;
            else ones++;
        }

        int index = 0;
        while (ones-- > 0) a[index++] = 1;
        while (zeros-- > 0) a[index++] = 0;

        System.out.println(Arrays.toString(a));
    }
}
