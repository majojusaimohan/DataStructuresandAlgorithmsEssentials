package Java8.streams;

import Java8.functionalprogramming.Instructor;
import Java8.functionalprogramming.Instructors;

import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String args[]){


        Set<String> collect = Instructors.getAll().stream().map(Instructor::getName)
                .map(String::toUpperCase)
                .limit(7)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
