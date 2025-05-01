package org.dsa.string.basic;

import java.util.Scanner;

public class StringUtil {

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        return scanner.next();
    }
}
