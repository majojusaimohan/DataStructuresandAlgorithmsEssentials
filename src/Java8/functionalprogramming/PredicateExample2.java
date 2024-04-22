package Java8.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String args[]){

        List<Instructor> instructors= Instructors.getAll();

        Predicate<Instructor> p1 = (i)->i.isOnlineCourses();
        Predicate<Instructor> p2 = (i)->i.getYearsOfExperience()>7;

        instructors.forEach(instructor -> {
            if(p1.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("----------------------------------------------");
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });
    }
}
