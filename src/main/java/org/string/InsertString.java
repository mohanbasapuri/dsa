package org.string;

public class InsertString {

    public static void main(String[] args) {
//        String str = "Hi,How are you?And Hi Roshan!";
//        String after = "Hi";
//        String input = "Mohan";
//
//        //will replace wherever Hi found in string
//        String newStr = str.replace("Hi",after+" "+ input);
//        System.out.println(newStr);
//
//        //will replace only first occurrence of  Hi string
//        String newStr2 = str.replaceFirst("Hi", after+ " " + input);
//        System.out.println(newStr2);
//
//        //will replace the position where you want
//        StringBuilder builder = new StringBuilder(str);
//        int indexOfHi = str.indexOf(after) + after.length();
//        builder.insert(indexOfHi," "+input);
//        System.out.println(builder);
//
//        String str1 = "Hello World";
//        int lastIndex = str1.lastIndexOf("o", 9); // 7
//        System.out.println(lastIndex);

        String str1 = new String("Hello");
        String str2 = "Hello";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println("Memory reference of str1: " + System.identityHashCode(str1));
        System.out.println("Memory reference of str2: " + System.identityHashCode(str2));

        String str = "abc";
        str.codePoints().forEach(System.out::println);

    }
}
