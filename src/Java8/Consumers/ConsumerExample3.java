package Java8.Consumers;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {

    public static void main(String args[]){
        IntConsumer intConsumer=(s1)->System.out.println(s1);
        intConsumer.accept(10);

        LongConsumer longConsumer= (s1)->System.out.println(s1*10l);
        longConsumer.accept(10l);

        DoubleConsumer doubleConsumer= (s1)->System.out.println(s1*10);
        doubleConsumer.accept(50);

    }
}
