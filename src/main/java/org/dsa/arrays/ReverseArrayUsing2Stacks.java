package org.dsa.arrays;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseArrayUsing2Stacks {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        // using for loop
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();

        for (int i : a) {
            stack1.push(i);
        }

        int len = stack1.size();
        for (int i = 0; i < len; i++)
            stack2.push(stack1.pop());
        System.out.println(stack2);

        //using stream api
        Stack<Integer> stackList1 = Arrays.stream(a).boxed().collect(Collectors.toCollection(Stack::new));

        Stack<Integer> stackList2 = new Stack<>();
        while(!stackList1.empty())
            stackList2.push(stackList1.pop());
        System.out.println(stackList2);
    }
}
