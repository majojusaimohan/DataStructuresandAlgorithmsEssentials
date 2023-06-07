package Arrays;

//
//Sorted Pair Sum
//        Given a sorted array and a number x, find a pair in array whose sum is closest to x.
//
//        Input Format
//
//        In the function an integer vector and number x is passed.
//
//        Output Format
//
//        Return a pair of integers.
//
//
//
//        Sample Input
//
//        {10, 22, 28, 29, 30, 40}, x = 54
//
//
//        Sample Output
//
//        22 and 30
public class SortedPairSum {


    void sortedpairsum(int arr[], int val) {

        int s = 0, e = arr.length - 1, pair1 = 0, pair2 = 0, diff = 999999;
        while (s < e) {
            int abs = Math.abs((arr[s] + arr[e]) - val);
            if (abs <= diff) {
                diff = abs;
                pair1 = arr[s];
                pair2 = arr[e];
            }
            if (abs > diff) {
                e = e - 1;
            } else {
                s = s + 1;
            }

        }
        System.out.println(pair1 + " " + pair2);
    }

    public static void main(String args[]) {

        SortedPairSum sortedPairSum = new SortedPairSum();

        int arr[] = {10, 22, 28, 29, 30, 40};
        sortedPairSum.sortedpairsum(arr, 54);


    }

}
