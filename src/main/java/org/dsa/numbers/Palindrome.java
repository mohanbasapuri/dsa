package org.dsa.numbers;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        while(num > 0 ){
            System.out.print(num % 10);
             num = num / 10;
        }
    }
}
