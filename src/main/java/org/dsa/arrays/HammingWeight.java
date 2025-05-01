package org.dsa.arrays;

public class HammingWeight {
    public static void main(String[] args) {
        //o(n)
        System.out.println(hammingWeight(2147483645));

        //o(1) ->> 100% pure no space & 0ms code
        System.out.println(hammingWeightWitAndOperation(2147483645));
    }

    private static int hammingWeightWitAndOperation(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        int count = (int) sb.chars().boxed().filter(ones -> ones == '1').count();
        return count;
    }
}
