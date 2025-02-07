package org.numbers;

public class Prime {
    public static void main(String[] args) {
        int num = 49;

        /*if(isPrime(num))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");*/

        int[] list = new int[]{34,45,66,23,11};
        isPrime(list);
    }

    private static boolean isPrime(int num) {
        //check even number
        if(num <= 1 || num % 2 == 0)
            return false;

        // n/2
        for(int i = 2; i < num/2 ; i++){
            if(num % i == 0)
                return false;
        }

        //sqrt method
        for(int i = 2; i <= Math.sqrt(num) ; i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }

    static void isPrime(int[] arr){
        for(int i = 0; i< arr.length; i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
