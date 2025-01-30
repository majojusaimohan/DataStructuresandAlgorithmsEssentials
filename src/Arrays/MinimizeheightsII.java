package Arrays;

import java.util.Arrays;

public class MinimizeheightsII {


    public static void main(String args[]){
        int arr[] = new int[]{12, 6, 4, 15, 17, 10};
        System.out.println(getMin(arr,6));

    }

    public static int getMin(int[] arr, int k){

        Arrays.sort(arr);
        int res=arr[arr.length-1]-arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0)
                continue;
          int  minH=Math.min(arr[0]+k,arr[i]-k);
           int maxH=Math.max(arr[arr.length-1]-k,arr[i-1]+k);
            res=Math.min(res,maxH-minH);

        }

        return res;


    }
}
