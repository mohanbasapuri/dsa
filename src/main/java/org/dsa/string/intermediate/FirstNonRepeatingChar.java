package org.dsa.string.intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    private static void printFirstNonRepeatingChar(String str) {

        Map.Entry<Character, Long> non = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(d -> d.getValue() == 1)
                .findFirst()
                .get();
        System.out.println(non);

        //map frequency
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char no_repeated = map.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
        System.out.println(no_repeated);

        //Using ascii value o(n)T & o(1)S
        int[] freq = new int[128]; //128 will cover all basic special chars,digits,lowercase&uppercase
        for(char c:str.toCharArray()){
            freq[c]++;
        }

        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i)] == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "madam1";
        printFirstNonRepeatingChar(str);
    }


}
