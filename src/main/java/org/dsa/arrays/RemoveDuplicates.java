package org.dsa.arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1,1,9,4,6,7,8,2,4};

        //Set to remove duplicates -> maintains order
        Set<Integer> intSet = new LinkedHashSet<>();
        for(int num: a)
            intSet.add(num);
        System.out.println(intSet);

        //Hashmap -> maintains order
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : a){
            if(!map.containsKey(num))
                map.put(num, 1);
        }
        System.out.println(new ArrayList<>(map.keySet()));
    }

}
