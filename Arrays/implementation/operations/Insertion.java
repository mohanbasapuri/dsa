package Arrays.implementation.operations;

/*
    Static Array says that there is no operations can be done without an index except copying array.
 */

public class Insertion {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5}; //declare an array & initialization type - 1
        int input1[] = new int[]{1, 2, 3, 4, 5};//declare an array & initialization type - 2
        int[] input2 = new int[5]; //declare an array & initialization type - 3
        input2[0] = 1;
        input2[1] = 2;
        input2[2] = 3;
        input2[3] = 4;
        input2[4] = 5;

        //lets start insertion
        input1[0] = 6; //results -> [6,2,3,4,5] -> replaced 1 by 6

        int len = 2;
        int[] input3 = new int[input.length + len]; // new array declared to insert 2 extra elements including input array values
        // input3 is all set with memory allocation -> [0,0,0,0,0,0,0]

        input3[5] = 6; //here if you see, forcing 5th position in early stage of insertion -> i=0 [1,0,0,0,0,6,0]
        for (int i = 0; i < input.length; i++) {
            input3[i] = input[i];
        }
        input3[6] = 7;

        // ideally, insertion w.r.t index must happen.
        for (int arr : input3) {
            System.out.println(arr); //[1,2,3,4,5,6,7]
        }

    }
}
