package java8interviewprograms;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddorEven {

    public static void main(String args[]){


        Predicate<Integer> p1 = (i)->i%2==0;
        Map<Boolean, List<Integer>> collect = Arrays.stream(IntStream.rangeClosed(1, 50).toArray()).boxed().collect(Collectors.partitioningBy(p1));
        System.out.println(collect);

    }
}
