package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NthLargestSalary {


    public static void main(String[] args){

        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("John", 50000);
        salaryMap.put("Alice", 60000);
        salaryMap.put("Bob", 55000);
        salaryMap.put("Emily", 62000);
        salaryMap.put("Michael", 58000);
        salaryMap.put("Sophia", 54000);
        salaryMap.put("David", 63000);
        salaryMap.put("Emma", 59000);
        salaryMap.put("Michael jordon", 58000);
        salaryMap.put("Sophia josyse", 54000);
        salaryMap.put("David warner", 63000);
        salaryMap.put("Emma watson", 59000);

       System.out.println(nthLargestSalary(2,salaryMap));

    }

    public static Map.Entry<Integer, List<String>> nthLargestSalary(int n, Map<String, Integer> map){

      return  map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                 .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(n - 1);


    }

}
