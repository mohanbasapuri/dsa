package org.dsa.arrays;


import java.util.Arrays;

public class SortInAsc {
    public static void main(String[] args) {
        int[] a = {1,0,0,2,1,0,1,2,1,1,2,0,1};

        //applying counting alg_m due to countable integers like 0,1,2
        int zeroC = 0, oneC = 0, twoC =0;

        //take count of all 3 digits o(n)
        for(int b: a){
            if(b == 0) zeroC++;
            else if(b == 1) oneC++;
            else twoC++;
        }

        //overriding input array by re-indexing - make sure while loop follows ascending 0,1,2
        int index = 0;
        while(zeroC-- > 0) a[index++] = 0;
        while(oneC-- > 0) a[index++] = 1;
        while(twoC-- > 0) a[index++] = 2;

        System.out.println(Arrays.toString(a));

    }
}
