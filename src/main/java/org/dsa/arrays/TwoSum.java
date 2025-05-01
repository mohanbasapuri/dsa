package org.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        // There are three approaches
        int[] array = new int[]{10, 4, 14, 6, 1, 8, 5};
        int target = 14;

        //Brute force o(n^2)
        List<String> indexList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) indexList.add(i+"");
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == target) indexList.add(i + ":" + j);
            }
        }
        System.out.println(indexList);

        //Hashmap o(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        List<String> indexList1 = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if (target == array[i]) indexList1.add(i+"");
            int searchValue = target - array[i];
            if(map.containsKey(searchValue))
                indexList1.add(map.get(searchValue)+ ":"+ i);
            map.put(array[i],i);
        }
        System.out.println(indexList1);

        //two pointer o(n log n) not recommended for duplicate pairs
       /* Arrays.sort(array);
        List<String> indexList2 = new ArrayList<>();
        for(int i = 0, j = array.length -1; i < array.length;) {
            if (i < j) {
                int sum = array[i] + array[j];
                if (sum == target)
                    indexList2.add("{" + i + "," + j + "}");
                else if (sum < target)
                    i++;
                else if (sum > target)
                    j--;
                else
                    i++;j--;
            }
        }

        System.out.println(indexList2);*/
    }




}
