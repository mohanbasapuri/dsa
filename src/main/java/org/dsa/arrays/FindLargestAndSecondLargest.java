package org.dsa.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestAndSecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 8, 20, 15};

        //stream api
       Integer largest =  Arrays.stream(a).boxed().min(Comparator.reverseOrder()).get();
       Integer secondLargest =  Arrays.stream(a).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

       System.out.println(largest + ", " + secondLargest);

       //using just traverse
        int large = Integer.MIN_VALUE; //-1
        int secLarge = Integer.MIN_VALUE; //-1
        for(int i: a){
            if(i > large){ //1 > -1 1 > 1 , 99 > 1, 3 >99
                secLarge = large;
                large = i; //large =1 , large = 99
            }else if( i > secLarge && i!=large){
                secLarge = i;
            }
        }

        System.out.println("Large:"+large);
        System.out.println("2nd:"+secLarge);
    }
}
