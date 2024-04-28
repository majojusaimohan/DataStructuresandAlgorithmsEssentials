package Java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionvsStreamExample {
    public static  void main(String args[]){
        List<String> names = new ArrayList<>();
        names.add("Mohan");
        names.add("Raghav");
        names.add("Sandeep");
        System.out.println("__________________");
        System.out.println(names);

        names.remove("Sandeep");

        System.out.println("__________________");
        System.out.println(names);

        System.out.println("__________________");
        System.out.println(names);
        System.out.println("__________________");
        System.out.println(names);

        Stream<String> stream = names.stream();

        stream.forEach(System.out::println);

        // you cannot process stream 2 times

        List<String> stringList = names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println("__________________");
        System.out.println(stringList);

        System.out.println("__________________");
        System.out.println(names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList()));

    }
}
