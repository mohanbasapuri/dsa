package snippets;

public class OverloadWithNull {

        void test(Object o){
            System.out.println("Hi");
        }

        void test(String s) {
        System.out.println("Hello");
        }

    public static void main(String[] args) {
        OverloadWithNull a= new OverloadWithNull();
        a.test(null);
    }
}