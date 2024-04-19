package Java8.Consumers;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String args[]){
        List<Instructor> instructorsList = Instructors.getAll();
        // printing name and gender of the instructors
        BiConsumer<String,String> biConsumer= (name,gender)->System.out.println("name: "+name +" gender: " +gender);
        instructorsList.forEach(instructor -> {
            biConsumer.accept(instructor.getName(),instructor.getGender());
        });


        // printing name and courses by the instructors
        System.out.println("------------------------------------------------------------");
        BiConsumer<String, List<String>> biConsumer1 = (name,courses)->System.out.println("name: "+name +" gender: " +courses);
        instructorsList.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(),instructor.getCourses());
        });

        //printing name and gender of instructors who teach online

        System.out.println("------------------------------------------------------------");

        instructorsList.forEach(instructor -> {
            if(instructor.isOnlineCourses()){
                biConsumer.accept(instructor.getName(),instructor.getGender());
            }
        });


    }
}
