package Java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

    public static  void  main(String args[]){
        calculatePersonAgeInYear();
        lastElementInTheArray();
        firstTenOddNumbers();
        generateFibonacciSeries();
        generateFibonacciSeries();
        firstNonRepeatingCharacter();


    }
private static void calculatePersonAgeInYear(){
    LocalDate birthDate = LocalDate.of(1996,12,31);
    LocalDate currentDate = LocalDate.now();
    Period age = Period.between(birthDate,currentDate);
    System.out.println("Age of the person is: " +age.getYears());
}

private static void lastElementInTheArray(){
        int[] intArray={0,1,2,3,4,5};
        Integer lastElement= Arrays.stream(intArray)
                .boxed()
                .reduce((a,b)->b).orElse(-1);
        System.out.println("lastElementInTheArray: "+lastElement);
}

private static void firstTenOddNumbers(){
    Stream.iterate(1,i->i+2)
            .limit(10)
            .forEach(System.out::print);
}

private static void generateFibonacciSeries(){
//        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
//                .limit(10)
//                .forEach(System.out::println);

    Function<int[], List<Integer>> intarraytolist = array->Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());
    List<Integer> collect = Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
            .limit(10)
            .map(intarraytolist)
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());
    System.out.println(collect);
}

private static void firstNonRepeatingCharacter(){
        String tempstr="rohitrohi";
        System.out.println(Arrays.stream(tempstr.split(""))
                .filter(str->tempstr.indexOf(str)==tempstr.lastIndexOf(str))
                .findFirst()
                .orElse(""));
}

}
