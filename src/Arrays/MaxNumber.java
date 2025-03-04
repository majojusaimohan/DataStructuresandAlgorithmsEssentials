package Arrays;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.OptionalInt;

public class MaxNumber {

    public static  void main(String args[]){

        int arr[] = new int[]{1,4,2,3,5,67,8,9,3,67};

        OptionalInt max=Arrays.stream(arr).max();

        System.out.println(max.getAsInt());

    }
}
