package org.dsa.arrays;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] a = {7,1,5,4,6,2};

        int min = a[0], profit = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < min)
                min = a[i];

            profit = Math.max(profit, a[i] - min);
        }

        System.out.println(profit);
    }
}
