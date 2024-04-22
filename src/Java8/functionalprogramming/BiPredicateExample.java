package Java8.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String args[]){

        List<Instructor> instructors = Instructors.getAll();

        BiPredicate<Boolean,Integer> biPredicate = (isonline,yearsofexerience)->isonline==true && yearsofexerience>7;

        BiConsumer<String, List<String>> biConsumer = (name, course)->System.out.println("Name :" +name +"Cources:" +course);

        instructors.forEach(instructor -> {
            if(biPredicate.test(instructor.onlineCourses,instructor.yearsOfExperience)){
                biConsumer.accept(instructor.getName(),instructor.getCourses());
            }

        });
    }
}
