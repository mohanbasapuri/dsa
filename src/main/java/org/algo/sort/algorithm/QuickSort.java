package org.algo.sort.algorithm;


public class QuickSort {
    public static void quickSort(int low, int high, int[] array) {
        if (low < high) {
            int partitionIndex = partition(low, high, array);
            quickSort(low, partitionIndex, array);
            quickSort(partitionIndex + 1, high, array);
        }
    }

    private static int partition(int low, int high, int[] array) {
        int pivot = array[low];
        int j = high + 1;
        int i = low - 1;
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i >= j)
                return j;
            swap(array, i, j);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
