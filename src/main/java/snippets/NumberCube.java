package snippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberCube {
    public static void main(String[] args) {
        int arr[] = {1, 2, 20, 56, 22};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).startsWith("2")) list.add(arr[i]);
        }
       list.stream().collect(Collectors.toMap(Function.identity(), value -> value * value * value)).entrySet().forEach(System.out::println);

        Arrays.stream(arr)
                .mapToObj(i -> i)
                .filter(num -> num.toString().startsWith("2"))
                .collect(Collectors.toMap(k -> k, v -> v * v * v))
                .entrySet()
                .forEach(System.out::println);
    }
}