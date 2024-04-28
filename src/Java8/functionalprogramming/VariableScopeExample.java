package Java8.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class VariableScopeExample {
    static  int m=0;
    public static void main(String args[]){
        int k=0;

        Predicate<Integer> p1 = (i)->i>10;

        Instructors.getAll().forEach(instructor -> {
            int a=0;
            System.out.println(instructor + "" +a);
        });

        Instructors.getAll().forEach(instructor -> {
            int a=0;
            System.out.println(instructor + "" +m++);
        });



    }
}
