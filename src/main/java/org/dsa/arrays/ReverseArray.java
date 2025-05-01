package org.dsa.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        // using o(n) reverse reading
        int[] revArray = new int[a.length];
        int index = a.length -1;
        for(int i: a) {
            revArray[index--] = i;
        }
        System.out.println(Arrays.toString(revArray));

        //stream api
        Integer[] aInt = {1,2,3,4,5};
        Arrays.sort(aInt, Comparator.comparingInt( b -> -b));
        System.out.println(Arrays.toString(aInt));

        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
