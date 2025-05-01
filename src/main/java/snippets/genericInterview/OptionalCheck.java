package snippets.genericInterview;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalCheck {
    public static void main(String[] args) {
        Integer i = 10;
        Optional<Integer> opt = Optional.of(i); //prints 10
        System.out.println(opt.get());

        /** Integer j = null;
        Optional<Integer> opt1 = Optional.of(j); //throws nullpointerexception use Optional.ofNullable()
        System.out.println(opt1.get());
        */
        Integer l = null;
        Optional<Integer> opt3 = Optional.ofNullable(l); // opt3 will be empty object


        int k = 10;
        Optional<Integer> opt2 = Optional.of(k);
        System.out.println(opt2.get());

        int m = 10;
        OptionalInt opt4 = OptionalInt.of(m);
        System.out.println(opt4.getAsInt());

    }
}
