package Java8.Consumers;

import java.util.concurrent.CompletionService;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String args[]){
        Consumer<String> c1 = (s1)->{System.out.println("length of "+s1+ " is " +s1.length());};
        c1.accept("Hello how are you doing");

        Consumer<String> c2 =(s1)->{
            System.out.println("Given String is "+s1);
            System.out.println("length of "+s1+ " is " +s1.length());

        };
        c2.accept("i am very goood at running");

    }
}
