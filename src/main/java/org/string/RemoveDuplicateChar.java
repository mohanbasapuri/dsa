package org.string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateChar {
    private static StringUtil util = new StringUtil();


    public static void main(String[] args) {
        removeDuplicateCharacter(util.getInput());
    }

    private static void removeDuplicateCharacter(String input) {

        // Set collection
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder newString = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(set.add(ch))
                newString.append(ch);
        }
        System.out.println(newString.toString());

        // Map collection
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder newString1 = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(!map.containsKey(ch)) {
                map.putIfAbsent(ch, 0);
                newString.append(ch);
            }
        }
        System.out.println(newString.toString());

        //java8
        String newString2 = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(newString2);

        //String operation (pure)
        StringBuilder container = new StringBuilder();
        for(char c : input.toCharArray()){
            if(container.indexOf(String.valueOf(c)) == -1){
                container.append(c);
            }
        }
        System.out.println(container.toString());
    }
}
