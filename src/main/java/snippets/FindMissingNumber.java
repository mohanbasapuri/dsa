package snippets;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,8}; int N = 8;
        int XOR = 0;
        for(int i = 1 ; i <= N ; i++){
            XOR ^= i;
        }

        for(int i = 0; i < a.length; i++){
            XOR ^= a[i];
        }

        System.out.println(XOR);
    }
}