package Java8.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static  void  main(String args[]){

        BiConsumer<Integer,Integer> biConsumer=(s1,s2)->System.out.println("x: " + s1 +" y: " + s2);
        biConsumer.accept(10,20);


    }
}
