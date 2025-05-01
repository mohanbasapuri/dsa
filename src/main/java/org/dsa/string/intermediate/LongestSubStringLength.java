package org.dsa.string.intermediate;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubStringLength {
    public static void main(String[] args) {
        String s = "pwwkew";

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char curChar = s.charAt(end);

            // If duplicate character found, shrink window from the left
            if (map.containsKey(curChar) && map.get(curChar) >= start) {
                start = map.getOrDefault(curChar, 0) + 1;
            }
            map.put(curChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        String longestSubstring = s.substring(start, start + maxLength);

        System.out.println(longestSubstring + ", " + maxLength);
    }
}
