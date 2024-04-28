package java8interviewprograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharacters {


    public static void main(String args[]) {
        String s = "Hi Hello how are you doing today i hope you are good";
        Map<Character,Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }



}
