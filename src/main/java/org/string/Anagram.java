package org.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "mmahim"; // ex: rAt , rat2 , cat
        String str2 = "mjahim"; // ex: aRt , art2, mat

        checkAnagrams(str1,str2);
    }

    private static void checkAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            System.exit(0);
        }

        // using sorting & equals
        /*if(commons(str1).equals(commons(str2)))
            System.out.println("Anagram!");
        else
            System.out.println("No an Anagram!");*/

        //hashmap frequency
        Map<Character,Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()){
            if(!map.containsKey(c) && map.get(c) == 0){
                System.out.println("Not an anagram");
                System.exit(0);
            }else{
                map.put(c, map.get(c) -1);
            }
        }
        System.out.println("Anagram");



    }

    private static String commons(String input){
            input = input.toLowerCase();
            char[] charArr = input.toCharArray();
            Arrays.sort(charArr);

            StringBuilder myFinalString = new StringBuilder();
            for (char c : charArr) {
                myFinalString.append(c);
            }
            return myFinalString.toString();
    }
}
