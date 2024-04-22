package Java8.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {

    public static void main(String args[]){
        Predicate<Instructor> p1 = (i)->i.isOnlineCourses()==true;
        Predicate<Instructor> p2 =(i)->i.getYearsOfExperience()>8;
        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String, List<String>> biConsumer = (name,course)->System.out.println("Name :" +name +"Cources:" +course);

        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                biConsumer.accept(instructor.getName(),instructor.getCourses());
            }

        });
    }
}
