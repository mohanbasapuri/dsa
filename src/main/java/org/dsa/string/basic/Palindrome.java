package org.dsa.string.basic;

public class Palindrome {
    private static final StringUtil util = new StringUtil();

    private static String palindromeCheck(String input) {
        System.out.println("Origin String :" + input);
        StringBuilder revString = new StringBuilder(input);
        revString.reverse();
        System.out.println("Reversed String :" + revString);
        return revString.toString();
    }

    public static void main(String[] args) {
        String input = util.getInput();
        if(palindromeCheck(input).equals(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }


}

