package org.dsa.arrays;

import java.util.Arrays;

public class FindSmallestAndSecondSmallest {
    public static void main(String[] args) {

        int[] a = {10, 5, 20, 8, 20, 15};

        //stream api
        Integer smallest =  Arrays.stream(a).boxed().sorted().findFirst().get();
        Integer secondSmallest =  Arrays.stream(a).boxed().distinct().sorted().skip(1).findFirst().get();

        System.out.println(smallest + ", " + secondSmallest);

        //using just traverse
        int small = Integer.MAX_VALUE; //-1
        int secSmall = Integer.MAX_VALUE; //-1
        for(int i: a){
            if(i < small){
                secSmall = small;
                small = i;
            }else if( i < secSmall && i!=small){
                secSmall = i;
            }
        }

        System.out.println("Small:"+small);
        System.out.println("2nd:"+secSmall);
    }
}

