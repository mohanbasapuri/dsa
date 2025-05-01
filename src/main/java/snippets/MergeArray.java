package snippets;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 4, 6, 8};

        int arr3[] = mergeArrays(arr1, arr2);

        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            mergedArray[i] = arr1[i];
        }
        
        int k = arr1.length;
        for(int i = 0; i < arr2.length; i++){
            mergedArray[k] = arr2[i];
            k++;
        }
        return mergedArray;
    }
}