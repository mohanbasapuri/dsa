package org.dsa.arrays;

public class FindUniqueElementUsingXOR {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,4,5,5};

        int unique = findUniqueEle(a);
        System.out.println(unique);

    }

    private static int findUniqueEle(int[] a) {
        int unique = 0;
        for(int num : a){
            unique ^= num;
        }
        return unique;
    }
}
