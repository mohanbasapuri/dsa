package org.dsa.string.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagramAndReturnCount {
    public static void main(String[] args) {
        String[] arr = {"cat","art","listen","silent","make","cake","act","tac","tar"};

        List<String> list = new ArrayList<>();
        for (String value : arr) {
            StringBuilder sb = new StringBuilder();
            char[] ch = value.toLowerCase().toCharArray();
            Arrays.sort(ch);
            list.add(sb.append(ch).toString());
        }

        Collections.sort(list);
        System.out.println(list);

        List<List<String>> newList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < list.size();) {
            List<String> innerList = new ArrayList<>();
            while (j < list.size() && list.get(i).equals(list.get(j))) {
                innerList.add(list.get(i));
                j++;
            }
            i = j;
            newList.add(innerList);
        }
        System.out.println(newList);
        /*for(List<String> li : newList ){
            System.out.println(li + ":"+ li.size());
        }*/

        newList
                .stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .forEach(s -> System.out.println(s.getKey() + ":" + s.getValue()));
    }
}
