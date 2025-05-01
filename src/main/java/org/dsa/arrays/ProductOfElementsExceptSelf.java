package org.dsa.arrays;

import java.util.Arrays;

public class ProductOfElementsExceptSelf {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        // O(N^2) & O(N)
        int[] productArray = product(a);
        //O(N) & O(1) but used division
        int[] productArray2 = product2(a);
        //O(N) & O(1) no division
        int[] productArray3 = product3(a);
        System.out.println(Arrays.toString(productArray));
        System.out.println(Arrays.toString(productArray2));
        System.out.println(Arrays.toString(productArray3));
    }

    private static int[] product3(int[] a) {
        // a[3] = 4 , total = 24 , product = 1*2*3 =6 , diff = 18 ->
        return a;
    }

    private static int[] product2(int[] a) {
        int total = 1, exceptTotal =1;
        int j = 0;
        for(int i = 0 ; i < a.length; i++){
             total *= a[i];
             if(i != j)
             exceptTotal *= a[i];
             int diff = total - exceptTotal;
             a[i] = diff;
             j++;
        }
        return a;
    }

    private static int[] product(int[] a) {
        int[] productArray = new int[a.length];
        for(int i = 0 ; i < a.length; i++){
            int product = 1;
            for(int j = 0; j < a.length; j++){
                if(j!=i)
                   product *= a[j];
            }
            productArray[i] = product;
        }
        return productArray;
    }
}
