package Arrays;

//
//Lower Bound
//        Given an array of integers A (sorted) and a integer Val.
//
//        Implement a function that takes A and Val as input parameters and returns the lower bound of Val.
//
//        Note : If Val is not present in array then Lower bound of a given integer means integer which is just smaller than given integer.
//
//        Otherwise Val itself is the answer.
//
//        If Val is less than smallest element of array A then return '-1' in that case.
//
//
//
//        Example 1  :
//
//        A = [-1, -1, 2, 3, 5]
//
//        Val = 4
//
//        Answer :  3
//
//        Since 3 is just smaller than 4 in the array.
//
//        Example 2  :
//
//        A = [1, 2, 3, 4, 6]
//
//        Val = 4
//
//        Answer :  4
//        Since 4 is equal to 4.

public class Lowerbound {
    public int lowerboundarray(int arr[], int val) {

        int lowerbound = -1, start = 0, end = arr.length - 1, mid = 0;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] <= val) {
                lowerbound = arr[mid];
                start = mid + 1;

            } else {
                start = mid - 1;
            }
        }


        return lowerbound;
    }

    public static void main(String args[]) {

        int arr[] = {-1, -1, 2, 3, 5};
        Lowerbound lowerbound = new Lowerbound();
        System.out.print(lowerbound.lowerboundarray(arr, 4));

    }
}
