package java8interviewprograms;

public class ExampleFunction {

    public  static int factorial(int n){

       if(n<=-1){
           System.out.println("only positive numbers are allowed")
       if(n<=0)
           return 1;
       else
            return n*factorial(n-1);
    }
public static void main(String args[]){
      System.out.println(factorial(-1));

}

}
