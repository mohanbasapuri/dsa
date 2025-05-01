package snippets.genericInterview;

public class ScopeOfOverriddenMethod {
    public static void main(String[] args) {
        C c = new C();
        c.test();
    }
}

// Always Child class will have the highest visibility / equal visibility to parent
class C extends B{
    @Override
   public void test(){
        System.out.println("class C");
    }
}

class B{
    public void test(){
        System.out.println("class B");
    }
}
