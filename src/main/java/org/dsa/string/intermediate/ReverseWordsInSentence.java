package org.dsa.string.intermediate;

public class ReverseWordsInSentence {

    public static void main(String[] args) {
        String s = "Hello Mohan, How are you";
        StringBuilder reversedWords = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }
        System.out.println(reversedWords);
    }

}
