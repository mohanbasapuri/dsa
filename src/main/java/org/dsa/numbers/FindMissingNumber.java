package org.dsa.numbers;


public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a = {3,0,1};
        int N = a.length + 1; // expected numbers in array

        // XOR Rule -> m ^ 0 = m , m ^ m = 0
        // ex: m=4 , 4 ^ 0 = 4, 4 ^ 4 = 0
        int xor1 = 0;
        for (int i = 0; i < N; i++) {
            xor1 ^= i; //actual numbers xor
        }

        for (int j : a) {
            xor1 ^= j; // given number xor
        }

        System.out.println("Missing number : " + (xor1)); // actual "XOR" given = missing_number
    }
}
