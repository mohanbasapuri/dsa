package org.dsa.string.basic;


public class ToUpperCase {
    private static StringUtil util = new StringUtil();


    public static void main(String[] args) {
        uppercase(util.getInput());
    }

    private static void uppercase(String input) {

        // built-in
        System.out.println(input.toUpperCase());

        // toCharArray()
        StringBuilder toUpper2 = new StringBuilder();
        for(char c: input.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                toUpper2.append((char) (c - 32));
            }else{
                toUpper2.append(c);
            }
        }
        System.out.println(toUpper2);

        // using bytes
        input = input.toLowerCase();
        byte[] inBytes = input.getBytes();
        StringBuilder toUpper1 = new StringBuilder();
        for (int i = 0; i < inBytes.length; i++) {
            if (Character.isLetter(inBytes[i]))
                toUpper1.append((char) (inBytes[i] - 32));
            else
                toUpper1.append(input.charAt(i));
        }
        System.out.println(toUpper1);

    }
}
