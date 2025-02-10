package org.string;

import java.util.stream.Stream;

public class PrintEvenWords {

    private static void printEvenWords(String s) {
        String[] strArray = s.split(" ");
        /** for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() % 2 == 0) {
                System.out.println(strArray[i]);
            }
        }*/

        //enhanced for
        /** for(String word : s.split(" ")){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }*/

        Stream.of(strArray).filter(word -> word.length() % 2 == 0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printEvenWords("i am Mohan , Nice to meet you Chip");
    }
}