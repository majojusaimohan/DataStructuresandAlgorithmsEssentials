package Java8.functionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String args[]){
        IntPredicate p1= i->i>100;
        System.out.println(p1.test(102));

        LongPredicate  p2 = i->i>100l;
        System.out.println(p2.test(102l));

        DoublePredicate p3 = i->i>100.23;

        System.out.println(p3.test(102.3));
    }
}
