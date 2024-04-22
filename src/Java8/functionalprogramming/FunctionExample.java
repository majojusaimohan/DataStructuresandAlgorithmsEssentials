package Java8.functionalprogramming;

import Java8.SumOfNumbersUsingCallable;

import javax.swing.*;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String args[]){
        Function<String,String> f1 =(i)->i.toLowerCase();
        System.out.println(f1.apply("PROGRAMMING"));

        Function<Integer,Double> f2=(i)-> Math.sqrt(i);
        System.out.println(f2.apply(64));

        Function<String,String> f3 = (s)->s.concat(" In Java");

        System.out.println(f1.andThen(f3).apply("PROGRAMMING"));
        System.out.println(f1.compose(f3).apply("PROGRAMMING"));
    }
}
