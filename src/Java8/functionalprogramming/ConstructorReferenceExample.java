package Java8.functionalprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {

    public static void main(String args[]){
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("jhon",10,"software developer",
                "male",true
                , Arrays.asList("Java, Devops"));

        System.out.println(instructor);
    }
}
