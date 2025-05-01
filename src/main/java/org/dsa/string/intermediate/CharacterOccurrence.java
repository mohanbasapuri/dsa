package org.dsa.string.intermediate;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String s = "Java Mohan";
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> !Character.isWhitespace(ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
             //  .stream().filter(v-> v.getValue() ==1) //for non-duplicates
                .forEach(System.out::println);
    }
}
