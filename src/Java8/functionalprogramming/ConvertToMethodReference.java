package Java8.functionalprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReference {

    public static void main(String args[]){
        Predicate<Instructor> p1 = ConvertToMethodReference::greaterThanTenYears;

        Instructors.getAll().forEach(instructor -> {
            if(p1.test(instructor)){
                System.out.println(instructor);
            }
        });
    }

    public static boolean greaterThanTenYears(Instructor instructor){

        if(instructor.getYearsOfExperience()>10){
            return true;
        }
        return false;
    }
}
