package Arrays;

public class SumofSubarray {

    // brute force method time complexity is O(N^3)
    int largesrSubArraySumBruteForce(int array[]){


        int largestsum=0;
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length;j++){
                int subarraysum=0;
                for(int k=i; k<=j;k++){
                    subarraysum=subarraysum+array[k];
                }
               // System.out.println(subarraysum);
                if(subarraysum>largestsum)
                    largestsum=subarraysum;
            }

        }
        return largestsum;
    }

    // Here we are using prefix sum approch to avoid recalculating the sub arrays time complexcity is O(N^2) and space complexcity is O(N)
    int largestSubArraySumPrefixsum(int array[]){

        int prefix[]= new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++)
            prefix[i]=prefix[i-1]+array[i];

        int largestsum=0;
        for(int i=0; i<array.length; i++){
            int subarraysum = 0;
            for(int j=i; j<array.length;j++) {
                subarraysum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                if(subarraysum>largestsum)
                    largestsum=subarraysum;
            }

            }

        return largestsum;
    }

   // it is the most optimized soluiton for this problem with time complexity of O(N) and space complexity of O(1)
    int largestSubArraySumKadaneAlgorithm(int array[]){
        int currentsum=0, maxsum=0;

        for(int i=0; i<array.length;i++){

            currentsum=currentsum+array[i];
            currentsum=currentsum<0?0:currentsum;
            maxsum=currentsum>maxsum?currentsum:maxsum;


        }

        return maxsum;
    }

    public static void main(String[] args){

        int array[]={-2,1,-3,4,-1,2,1,-5,4};

        SumofSubarray p= new SumofSubarray();
        System.out.println( p.largesrSubArraySumBruteForce(array));
        System.out.println( p.largestSubArraySumPrefixsum(array));
        System.out.println( p.largestSubArraySumKadaneAlgorithm(array));


    }
}

