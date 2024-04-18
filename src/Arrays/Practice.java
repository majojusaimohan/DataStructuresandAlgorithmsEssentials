package Arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String args[]){

     Thread t1= new Thread(new EvenOdd(10,false));
        Thread t2= new Thread(new EvenOdd(10,true));

        t1.start();
        t2.start();
      //  t2.join();



    }
}


class EvenOdd implements  Runnable{

    int max;

    boolean isOdd;
    public EvenOdd(int max, boolean isOdd){
       this.max=max;

       this.isOdd=isOdd;
    }
    @Override
    public void run() {

        int i=isOdd==false?0:1;

        for(; i <= max; i=i+2){
            System.out.println(i +"::::"+ Thread.currentThread().getName());
        }

    }
}

