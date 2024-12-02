package sort;
/**
 * number sort
 * character sort
 * string sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{66, 44, 3, 9, 5,2,400,40};
        sortInt(arr);
        System.out.println();

        char[] chars = new char[]{'c','b','a','d'};
        sortChar(chars);
        System.out.println();

        String[] strings = new String[]{"sourab","zam","Jaggu","mohan","kashi","Praveen"};
        sortString(strings);
        System.out.println();
    }

    private static void sortString(String[] s) {
        for(int i = 0; i < s.length; i++){
            char[] s1 = s[i].toLowerCase().toCharArray();
            for(int j = 0; j < i; j++){
                char[] s2 = s[j].toLowerCase().toCharArray();
                if(s1[0] < s2[0]){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k] + " ");
        }

    }

    private static void sortChar(char[] c) {
        for(int i = 0;i < c.length; i++){
            for(int j = 0; j < i; j++){
                if(c[i] < c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
    }

    protected static void sortInt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
