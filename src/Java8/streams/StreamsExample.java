package Java8.streams;

import Java8.functionalprogramming.Instructor;
import Java8.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String args[]){
        // creating a map that has name and list of cources which are online and who has 10 years of experience

        Predicate<Instructor> p1 = (instructor)->instructor.isOnlineCourses();
        Predicate<Instructor> p2 = (instrucotr)->instrucotr.getYearsOfExperience()>10;

        List<Instructor> list = Instructors.getAll();

        Map<String,List<String>> map = list.stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName,Instructor::getCourses ));

        System.out.println(map);


    }
}
