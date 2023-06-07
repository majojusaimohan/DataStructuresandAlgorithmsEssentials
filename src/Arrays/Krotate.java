package Arrays;

//K-Rotate
//        Given an integer vector and a value k, your task is to rotate the array k times clockwise.
//
//        Input Format
//
//        In the function an integer vector and number k is passed.
//
//        Output Format
//
//        Return an integer vector.
//
//
//
//        Sample Input
//
//        {1, 3, 5, 7, 9}, x = 2
//
//
//        Sample Output
//
//        {7, 9, 1, 3, 5}
//
//
//        Explanation
//
//        After 1st rotation - {9, 1, 3, 5, 7}
//        After 2nd rotation - {7, 9, 1, 3, 5}?

import java.util.Arrays;
import java.util.Collections;

public class Krotate {


    void krotate(int arr[], int k) {

        // k=(arr.length-1)%k;
        int[] arry = arr;

        arry = rotate(arry, 0, arr.length - k - 1);
        arry = rotate(arry, arr.length - k - 1, arr.length - 1);
        arry = rotate(arry, 0, arr.length - k - 1);

        for (int i = 0; i < arry.length; i++) {
            System.out.print(" " + arry[i]);
        }


    }

    int[] rotate(int array[], int start, int last) {
        while (start < last) {
            int e = array[start];
            array[start] = array[last];
            array[last] = e;
            start = start + 1;
            last = last - 1;
        }
//            System.out.println();
//        for(int i =0; i<array.length; i++){
//            System.out.print(" "+array[i]);}
        return array;
    }

    public static void main(String args[]) {

        int arry[] = {1, 3, 5, 7, 9};
        Krotate krotate = new Krotate();
        krotate.krotate(arry, 2);

        Integer arr[] = {10, 20, 30, 40, 50};

        System.out.println("Original Array : " +
                Arrays.toString(arr));

        // Please refer below post for details of asList()
        // https://www.geeksforgeeks.org/array-class-in-java/
        // rotating an array by distance 2
        Collections.rotate(Arrays.asList(arr), 2);

        System.out.println("Modified Array : " +
                Arrays.toString(arr));

    }
}
