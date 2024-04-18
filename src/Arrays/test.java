package Arrays;

public class test {

    public static  void main(String args[]) {
        int number = -1234,sum = 0, temp = 0;
        temp=number;
       // System.out.println(number);

        if (number < 0) {
            temp=number*-1;
        }

        while(temp>0){
           int rem= temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
        }
        if (number < 0) {
            sum=sum*-1;
        }

        System.out.println(sum);


    }



}
