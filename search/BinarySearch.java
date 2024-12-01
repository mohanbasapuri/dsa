package search;

public class BinarySearch {

    public static void main(String[] args) {
        //   int[] arr = {6, 5, 4, 3, 2, 1}; //descending array
        int[] arr = {1, 2, 3, 4, 5, 6}; //ascending array
        int target = 3;
        int index = binarySearch(arr, target);
        System.out.println(index + " is index of search element: " + target);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; //To assume array is Asc/Dsc

        while (start <= end) {
            int mid = start + (end - start) / 2; // this wont fail for bigger indexes while (s+e)/2 will fail

            if (arr[mid] == target)
                return mid;           //Best case

            else if (isAsc) {         // worst case
                if (target < arr[mid]) { //Asc means assuming target should be lesser than middle element
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) { //Dsc means assuming target should be greater than middle element
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; //element not found
    }
}
