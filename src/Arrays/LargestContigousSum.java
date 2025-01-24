package Arrays;

public class LargestContigousSum {
    public static void main(String args[]){
        int arr[]= new int[]{2, 3, -8, 7, -1, 2, 3};
        System.out.println(bruteLargestContigousSum(arr));
        System.out.println(betterLargestContigousSum(arr));
        System.out.println(optimalLargestContigousSum(arr));
        System.out.println(followupLargestContigousSum(arr));



    }

    public  static int bruteLargestContigousSum(int arr[]){

        int ans=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                ans=Math.max(sum,ans);
            }
        }
    return ans;

    }



    public  static int betterLargestContigousSum(int arr[]){

        int ans=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                    sum+=arr[j];
                }
                ans=Math.max(sum,ans);
            }
        return ans;

    }

    public  static int optimalLargestContigousSum(int arr[]){

        int ans=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(ans<sum) {
                    ans = sum;
                }
                if(sum<0){
                    sum=0;
                }

        }
        return ans;

    }

    public  static int followupLargestContigousSum(int arr[]){

        int ans=Integer.MIN_VALUE;
        int sum=0;
        int lowindex=0,highindex=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(ans<sum) {
                ans = sum;
                highindex=i;
            }
            if(sum<0){
                sum=0;
                lowindex=i;
            }

        }
        System.out.println(lowindex+" "+highindex);
        return ans;

    }
}
