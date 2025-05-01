package snippets;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        String rev = s.chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
