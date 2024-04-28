package Java8.functionalprogramming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {

    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean online,
                                             List<String> cources);
}
