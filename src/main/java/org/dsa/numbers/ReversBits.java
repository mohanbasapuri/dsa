package org.dsa.numbers;

public class ReversBits {
    public static void main(String[] args) {
        String n = "00000010100101000001111010011100";
        int n1 = Integer.parseUnsignedInt(n, 2); // Parse binary as unsigned
        /*for(int i = 0; i < n.length(); i++){
            int reverse = 0;
            for(int j = 0; j < 32; i++){
                reverse = reverse << 1;
                reverse = reverse | (Integer.parseInt(n.charAt(i)) & 1);
                n = n >> 1;
            }
        }


        System.out.println(reverse);*/
    }
}
