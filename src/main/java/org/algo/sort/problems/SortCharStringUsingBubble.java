package org.algo.sort.problems;

import static org.algo.sort.algorithm.BubbleSort.*;

public class SortCharStringUsingBubble {
    public static void main(String[] args) {
        int[] arr = new int[]{66, 44, 3, 9, 5,2,400,40};
        sortInt(arr);
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        char[] chars = new char[]{'c','b','a','d'};
        sortChar(chars);
        for (int k = 0; k < chars.length; k++) {
            System.out.print(chars[k] + " ");
        }
        System.out.println();

        String[] strings = new String[]{"sourab","zam","Jaggu","mohan","kashi","Praveen"};
        sortString(strings);
        for (int k = 0; k < strings.length; k++) {
            System.out.print(strings[k] + " ");
        }
        System.out.println();
    }
}
