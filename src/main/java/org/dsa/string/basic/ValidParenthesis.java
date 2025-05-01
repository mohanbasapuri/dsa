package org.dsa.string.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{}()[{}]{)}(";
        if(checkValidParenthesis(s)) System.out.println("Valid");
        else System.out.println("Not Valid");
    }

    private static boolean checkValidParenthesis(String s) {
            Map<Character,Character> map = new HashMap<>();
             map.put(')', '(');
             map.put('}', '{');
             map.put(']', '[');
           Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(!map.containsKey(s.charAt(i)))
                    stack.push(s.charAt(i));
                else{
                    if(stack.empty())
                        return false;
                    char topEle = stack.pop();
                    if(topEle != map.get(s.charAt(i)))
                        return false;
                }
            }
            return stack.empty();
    }
}
