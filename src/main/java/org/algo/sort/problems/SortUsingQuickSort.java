package org.algo.sort.problems;

import java.util.Arrays;

import static org.algo.sort.algorithm.QuickSort.quickSort;

public class SortUsingQuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 9, 99, 4, 8, 6, 11, 9};
        int low = 0;
        int high = array.length - 1;
        quickSort(low, high, array);
        System.out.println(Arrays.toString(array));
    }
}
