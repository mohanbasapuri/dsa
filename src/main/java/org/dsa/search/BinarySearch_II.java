package org.dsa.search;

public class BinarySearch_II {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int index = search(arr, target);
        System.out.println(index);
    }

    private static int search(int[] arr, int target) {

        if (arr[0] == target) return 0;

        int end = arr.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
