package org.string;

public class ToLowerCase {
    private static StringUtil util = new StringUtil();


    public static void main(String[] args) {
        lowerCase(util.getInput());
    }

    private static void lowerCase(String input) {
        //built in
        System.out.println(input.toLowerCase());

        // toCharArray()
        StringBuilder toLower = new StringBuilder();
        for(char c: input.toCharArray()){
            if(c >= 'A' && c <= 'Z')
                toLower.append((char) (c + 32));
            else
                toLower.append(c);
        }
        System.out.println(toLower);

        //bytes
        input = input.toUpperCase();
        byte[] bytes = input.getBytes();
        StringBuilder toLower2 = new StringBuilder();
        for(int i = 0; i< bytes.length; i++){
            if(Character.isLetter(input.charAt(i)))
                toLower2.append((char) (bytes[i] + 32));
            else
                toLower2.append(input.charAt(i));
        }
        System.out.println(toLower2);
    }
}
