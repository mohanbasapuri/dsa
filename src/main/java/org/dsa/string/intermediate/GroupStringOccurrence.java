package org.dsa.string.intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringOccurrence {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cat", "dog","apple");
        //using java 8 grouping
        Map<String,Long> map = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry<String,Long> d: map.entrySet()){
            System.out.println(d.getKey() + ":" + d.getValue());
        }

        // HashMap
        HashMap<String,Integer> map1 = new HashMap<>();
        for(String in: input){
                map1.put(in, map1.getOrDefault(in,0)+1);
        }
        map1.entrySet().forEach(System.out::println);

    }
}
