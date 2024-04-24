package Java8.functionalprogramming;

import java.awt.color.ProfileDataException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public  static  void main(String args[]){
        // BiFunction takes 2 inputs i.e list of instructors and a predicate and return map of instructora name and years


        Predicate<Instructor> p1 = (i)-> i.isOnlineCourses()==true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String,Integer>> bifunction =(instructors, instructorPredicate) ->{
            Map<String, Integer> map = new HashMap<>();
           instructors.forEach((instructor -> {
               if(instructorPredicate.test(instructor)){
                   map.put(instructor.getName(),instructor.getYearsOfExperience());
               }

           }));
            return map;
        } ;
    System.out.println(bifunction.apply(Instructors.getAll(),p1));
    }
}
