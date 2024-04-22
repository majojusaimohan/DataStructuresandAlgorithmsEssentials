package Java8.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Instructors {
    public static List<Instructor> getAll(){
        List<Instructor> instructors = new ArrayList<>();

        // Create 10 Instructor objects using the constructor
        instructors.add(new Instructor("John Doe", 5, "Senior Instructor", "Male", true, List.of("Java", "Python")));
        instructors.add(new Instructor("Jane Smith", 10, "Lead Instructor", "Female", true, List.of("React", "Angular")));
        instructors.add(new Instructor("Michael Brown", 8, "Instructor", "Male", false, List.of("C++", "C#")));
        instructors.add(new Instructor("Emily White", 7, "Instructor", "Female", true, List.of("SQL", "Data Science")));
        instructors.add(new Instructor("David Green", 12, "Professor", "Male", false, List.of("Cybersecurity", "Networking")));
        instructors.add(new Instructor("Emma Lee", 4, "Assistant Instructor", "Female", true, List.of("HTML", "CSS")));
        instructors.add(new Instructor("Liam King", 15, "Principal Instructor", "Male", false, List.of("PHP", "Ruby")));
        instructors.add(new Instructor("Isabella Morgan", 9, "Instructor", "Female", true, List.of("JavaScript", "Node.js")));
        instructors.add(new Instructor("Lucas Turner", 6, "Instructor", "Male", false, List.of("Go", "Rust")));
        instructors.add(new Instructor("Sophia Adams", 11, "Lead Instructor", "Female", true, List.of("Swift", "Kotlin")));

        return instructors;
    }

    public static void main(String art[]){

        List<Instructor> instructors = Instructors.getAll();
        // printing only the name of the instructors
        Consumer<Instructor> c1 = (s1)->{System.out.print(s1.getName());};
        instructors.forEach(c1);

        Consumer<Instructor> c2 = (s1)->System.out.println(s1.getCourses());
        instructors.forEach(c2);

        instructors.forEach(s1->{
            c1.andThen(c2).accept(s1);
        });

        // looping through all the instructor and printing  only who has experince more than 5 years
        Consumer<Instructor> c3 = (s1)-> System.out.println(s1);
        instructors.forEach((s1)->{
            if(s1.getYearsOfExperience()>5){
                c3.accept(s1);
            }
        });
        //Loop through all the instructors and print out their name and years of experience if years
        //of experience is >5 and teaches course online
        Consumer<Instructor> c4 = (s1)-> System.out.print(" "+s1.getYearsOfExperience()+"\n");
        instructors.forEach((s1)->{
            if(s1.getYearsOfExperience()>5){
                c1.andThen(c4).accept(s1);
            }
        });
    }
}
