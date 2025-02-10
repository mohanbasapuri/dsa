package org.string;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {

    public static void reverse(String input){
        /* built-in method */
        StringBuilder builder = new StringBuilder(input);
        StringBuilder revString1 = builder.reverse();
        System.out.println(revString1.toString());

         /* -----toCharArray()----------*/
        // 1+n objects are created
         String revString2 = "";
        char[] chars = input.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){ // i is always last index; ex: 5, i=4
            revString2 += chars[i];
        }
        System.out.println(revString2);

        // only one new object created
        StringBuilder revString3 = new StringBuilder();
        char[] chars1 = input.toCharArray();
        for(int i = chars1.length - 1; i >= 0; i--){ // i is always last index; ex: 5, i=4
            revString3.append(chars1[i]);
        }
        System.out.println(revString3);

        /* ----- using streamAPI reversing char sequence -------*/
        List<Character> chars2 = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        Collections.reverse(chars2);

        // two ways of converting chars to string
        // using for loop
        StringBuilder revString4 = new StringBuilder();
        for(Character c : chars2){
            revString4.append(c);
        }
        System.out.println(revString4);

        //using stream api
        String revString5 = chars2.stream().map(m -> String.valueOf(m)).collect(Collectors.joining());
        System.out.println(revString5);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.next();
        reverse(input);
    }
}
