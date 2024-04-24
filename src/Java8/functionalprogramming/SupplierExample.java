package Java8.functionalprogramming;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String args[]){
        Supplier<Integer> integerSupplier =()->(int)(Math.random()*1000);
        System.out.println(integerSupplier.get());
        System.out.println(integerSupplier.get());
    }
}
