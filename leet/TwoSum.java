package leet;


public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        sortDesc(nums);
        int[] arr = new int[nums.length];
        int count = 0;
        if (nums[0] == target) {
            return arr;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] < target && nums[j] < target) {
                    if (nums[i] + nums[j] == target) {
                        arr[count] = i;
                        arr[++count] = j;
                    }
                }
            }
        }
        return arr;
    }

    private static void sortDesc(int[] nums) {
        int pointerA = 0;
        int pointerB = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[pointerA] < nums[pointerB]) {

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 9};
        int[] a = twoSum(nums, 6);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // System.out.println(Arrays.asList());
    }
}
