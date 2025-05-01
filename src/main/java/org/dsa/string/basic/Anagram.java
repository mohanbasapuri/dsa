package org.dsa.string.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "li$ten"; // ex: rAt , rat2 , cat
        String str2 = "$ilent"; // ex: aRt , art2, mat
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            System.exit(0);
        }

        //works on any chars
        if (checkAnagramsUsingSorting(str1, str2) && checkAnagramsUsingHashMap(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }

        //works for only ASCII -> A-Z, a-z
        if (checkAnagramsUsingFrequencyIncrement("cat".toLowerCase(), "Tac".toLowerCase())){
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
    }

    private static boolean checkAnagramsUsingFrequencyIncrement(String str1, String str2) {

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int j = 0 ; j < 26; j++) {
            if (freq[j] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkAnagramsUsingHashMap(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) && map.getOrDefault(c,0) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }

    private static boolean checkAnagramsUsingSorting(String str1, String str2) {
        return commons(str1).equals(commons(str2));
    }

    private static String commons(String input) {
        char[] charArr = input.toCharArray();
        Arrays.sort(charArr);

        StringBuilder myFinalString = new StringBuilder();
        for (char c : charArr) {
            myFinalString.append(c);
        }
        return myFinalString.toString();
    }
}
