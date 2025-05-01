package org.algo.sort.algorithm;
/**
 * number sort
 * character sort
 * string sort
 */
public class BubbleSort {

    public static void sortString(String[] s) {
        for(int i = 0; i < s.length; i++){
            char[] s1 = s[i].toLowerCase().toCharArray();
            for(int j = 0; j < i; j++){
                char[] s2 = s[j].toLowerCase().toCharArray();
                if(s1[0] < s2[0]){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

    }

    public static void sortChar(char[] c) {
        for(int i = 0;i < c.length; i++){
            for(int j = 0; j < i; j++){
                if(c[i] < c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }

    public static void sortInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }


    }
}
