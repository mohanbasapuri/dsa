package org.dsa.string.basic;

public class VowelsConsonantsCount {
    private static StringUtil util = new StringUtil();

    private static void printVowelConsonants(String input) {
        int vow = 0, cons = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            } else {
                System.out.println("The character(" + c + ") in the input word is not a letter. ");
            }
        }

        // using bytes - in progress
       /* int[] arr = new int[]{97,101,105,111,117};
        byte[] bytes = input.getBytes();
        for(int i =0; i<bytes.length; i++){
            if((bytes[i]<= 122 && bytes[i]>= 98) || (bytes[i]<= 90 && bytes[i]>= 65)) {
                if (String.valueOf(arr).contains(String.valueOf(bytes[i]))) {
                    vow++;
                }else{
                    cons++;
                }
            }
        }
        */
        System.out.println("Vowels :" + vow);
        System.out.println("Consonants :" + cons);

    }

    public static void main(String[] args) {
        String input = util.getInput();

        printVowelConsonants(input);
    }


}
