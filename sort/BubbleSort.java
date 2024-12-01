package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{66, 44, 3, 9, 5,2,400,40};
        sort(arr);
    }
    
    protected static void sort(int[] a) {
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
            System.out.println(a[k]);
        }
    }
}
