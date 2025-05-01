package org.dsa.arrays;

import java.util.Arrays;

public class MoveZerosWithOrder {
    public static void main(String[] args) {
        int a[] = {1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1};
        int b[] = {1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1};

        int left = 0; //moving 0's to right
        for (int right = 0; right < a.length; right++) {
                if (a[right] != 0) { //choose which value to be moved
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                }
        }
        System.out.println(Arrays.toString(a));

        int lft = b.length - 1;  //moving 0's to left
        for (int rgt = b.length - 1; rgt >= 0; rgt--) {
            if (b[rgt] != 0) { //choose which value to be moved
                int temp = b[lft];
                b[lft] = b[rgt];
                b[rgt] = temp;
                lft--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
