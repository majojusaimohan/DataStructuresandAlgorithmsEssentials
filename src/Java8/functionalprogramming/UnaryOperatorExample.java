package Java8.functionalprogramming;

import java.util.function.*;

public class UnaryOperatorExample {

    public static  void main(String args[]){
        UnaryOperator<Integer> unaryOperator = (i)->i*10;
        System.out.println(unaryOperator.apply(10));

        Function<Integer,Integer> f1 = (i)->i*10;
        System.out.println(f1.apply(100));

        IntUnaryOperator intUnaryOperator = (i)->i*10;
        System.out.println(intUnaryOperator.applyAsInt(1000));

        LongUnaryOperator longUnaryOperator = (i)->i*10;
        System.out.println(longUnaryOperator.applyAsLong(10000l));

        DoubleUnaryOperator doubleUnaryOperator = (i)->i*40;
        System.out.println(doubleUnaryOperator.applyAsDouble(93020203993449l));


    }
}
