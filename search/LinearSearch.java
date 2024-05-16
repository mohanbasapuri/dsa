package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println("target found at the index : " + linearSearch_level1(arr, target));
    }


    //level-1 TC: O(N)
    // return index
    public static int linearSearch_level1(int[] arr, int target) {
        int count = 0;
        if (arr.length == 0) {
            System.out.println("count:" + count);
            return Integer.MIN_VALUE;
        } else if (arr[0] == target) {
            System.out.println("count:" + count);
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                count++;
                if (target == arr[i]) {
                    System.out.println("count:" + count);
                    return i;
                }
            }

        }

        return -1;
    }

}
