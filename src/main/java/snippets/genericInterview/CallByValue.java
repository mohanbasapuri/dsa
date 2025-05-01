package snippets.genericInterview;

public class CallByValue {
    static void test(){
        int i = 20;
    }



    public static void main(String[] args) {
        //callByValue -> with primitives
        int i = 10;
        test();
        System.out.println(i);

        //callByValue -> with objects
         Box b = new Box();
        b.value = 10;
        b.modify(b);
        System.out.println(b.value);
    }
}

class Box{
    int value;
    void modify(Box b){
        Box b1 = new Box();
        b.value = 20;
    }
}
