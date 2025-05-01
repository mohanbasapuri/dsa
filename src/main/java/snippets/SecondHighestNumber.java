package snippets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000,3000,5000,4000,2500,10000);

        Optional<Integer> sec_hig_sal1 = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(sec_hig_sal1);

        Optional<Integer> sec_hig_sal2 = list.stream().distinct().sorted((o1,o2) -> Integer.compare(o2,o1)).skip(1).findFirst();
        System.out.println(sec_hig_sal2);

    }

}
