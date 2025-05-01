package org.dsa.numbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");

        for(int i = 2; i < n; i ++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
