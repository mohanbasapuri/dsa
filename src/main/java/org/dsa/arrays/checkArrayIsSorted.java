package org.dsa.arrays;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7,6};

        // using 2 elements compare
        boolean isSorted = true;
        for(int i= 1 ; i< a.length;i++){
            if(a[i] < a[i-1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) System.out.println("Sorted");
        else System.out.println("Not Sorted");

    }
}
