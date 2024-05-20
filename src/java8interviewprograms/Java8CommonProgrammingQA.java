package java8interviewprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {

    public static  void main(String args[]){
    List<Student> studentList = Stream.of(
                    new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                    new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                    new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                    new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                    new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                    new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                    new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                    new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                    new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                    new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
            .collect(Collectors.toList());



    // find students whose rank is between 50 and 100;
        List<Student> students = studentList.stream().filter(student -> student.getRank() >= 50 && student.getRank() <= 100).collect(Collectors.toList());
        System.out.println(students);

        // find the students who stay in karnataka and sort by their name
        List<Student> karnatakastudents = studentList.stream().filter(student -> student.getCity().equals("Karnataka")).sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());
       // List<Student> karnatakastudents1 = studentList.stream().filter(student -> student.getCity().equals("Karnataka")).sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(karnatakastudents);


    }

}
