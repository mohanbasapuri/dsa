package snippets.genericInterview;

public class StaticForInheritance extends A{
    static void test(){
        System.out.println("Main method");
    }
    static void test(int n){
        System.out.println("Main method with n");
    }

    public static void main(String[] args) {
        StaticForInheritance.test();
        A.test();
    }
}

class A{
    static void test(){
        System.out.println("class A");
    }
}
