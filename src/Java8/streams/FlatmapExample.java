package Java8.streams;

import Java8.functionalprogramming.Instructor;
import Java8.functionalprogramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {

    public static void main(String args[]){

        List<String> instructorcources = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(instructorcources);


    }
}
