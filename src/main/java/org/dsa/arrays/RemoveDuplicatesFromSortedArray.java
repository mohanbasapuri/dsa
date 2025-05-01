package org.dsa.arrays;

public class RemoveDuplicatesFromSortedArray
{
	public static void main(String[] args) {
		int arr[] = { 1,1, 2, 2, 3, 4, 4, 4, 5, 6 };
        int n = arr.length;
 
        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);
 
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
	static int removeDuplicates(int arr[], int n){
		int index = 1;
		for(int i = 1; i < n; i++){
			if(arr[i-1] != arr[i]){
				arr[index] = arr[i];
				index++;
			}
		}

		for(int i = index; i < n; i++){
			arr[i] = 0;
		}
	    
	    return n;
	    
	}
	

}