package Sorting;

import java.util.*;

public class InsertionSort {

//    public void insetionSort(int a[]){
//        for(int i=1;i<a.length-1;i++) {
//            int current = a[i];
//            int prev=i-1;
//            while(prev>=0 &&current<a[prev]){
//                a[
//            }
//        }
//    }
    public static void main(String args[])
        {

            // Create an ArrayList
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(100);
            arrayList.add(1);
            arrayList.add(1000);
            arrayList.add(10);
            arrayList.add(10000);
            arrayList.add(10);

            // Convert ArrayList to NavigableSet using TreeSet
            NavigableSet<Integer> navigableSet = new TreeSet<>(arrayList);

            // Display elements in sorted order using navigation methods
            System.out.println("Elements in ascending order:");

            System.out.print(navigableSet.tailSet(10,false));
            System.out.print(navigableSet.tailSet(10));
            System.out.println(navigableSet.higher(10));
            int a=navigableSet.pollFirst();
            System.out.println(navigableSet.size());
        }
}
