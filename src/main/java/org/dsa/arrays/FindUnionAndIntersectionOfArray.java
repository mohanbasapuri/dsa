package org.dsa.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,6,7,8};

        Set<Integer> union = new LinkedHashSet<>();
        for (int i : a) union.add(i);
        for (int j : b) union.add(j);
        System.out.println("Union of a & b :"+union);

        Set<Integer> array1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int k : a) array1.add(k);
        for(int l : b){
            if(array1.contains(l))
                intersection.add(l);
        }

        System.out.println("Intersection of a & b: " + intersection);


    }
}
