package org.dsa.string.basic;

import java.util.HashMap;
import java.util.Map;

public class VerifyAlienDictionary {
    public static void main(String[] args) {
       if(checkAlienDictionary())
           System.out.println("Good");
       else System.out.println("Not Good");

        }

    private static boolean checkAlienDictionary() {
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = new String[]{"hello","leetcode"};
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < order.length(); i++)
            map.put(order.charAt(i), i );

        for(int i = 0; i < words.length - 1; i++) {
            for(int j = 0; j < words[i].length(); j++) {

                if(words[i].length() > words[i+1].length())
                    return false;
                //batman , bat
                if(j >= words[i+1].length())
                    return false;



                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currLetter = map.get(words[i].charAt(j));
                    int nextLetter = map.get(words[i+1].charAt(j));
                    if( currLetter > nextLetter)
                        return false;
                }else if(i == j){
                    if(map.get(words[i].charAt(i)) > map.get(words[i+1].charAt(j)))
                        return false;
                }else{
                    break;
                }
            }
        }
        return true;
    }
}
