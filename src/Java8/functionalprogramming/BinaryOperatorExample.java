package Java8.functionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {


    public static void main(String args[]){

        BinaryOperator<Integer> integerBinaryOperator= (a,b)->a+b;
        System.out.println(integerBinaryOperator.apply(10,20));

        Comparator<Integer> comparator = (a,b)->a.compareTo(b);

        BinaryOperator<Integer> intBinaryOperator =  BinaryOperator.maxBy(comparator);
        System.out.println(intBinaryOperator.apply(20,30));

        BinaryOperator<Integer> binaryOperator =  BinaryOperator.minBy(comparator);
        System.out.println(binaryOperator.apply(20,30));

        IntBinaryOperator intBinaryOperator1= (a,b)->a*b;
        System.out.println(intBinaryOperator1.applyAsInt(20,30));

    }

}
