package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int arr[] = IntStream.rangeClosed(0,5000).toArray();
    public  static  int total = IntStream.rangeClosed(0,5000).sum();

    public  static void main(String args[]) throws InterruptedException, ExecutionException {
        Callable callable1= ()->{
            int sum=0;
            for(int i=0;i<arr.length/2;i++){
                sum=sum+arr[i];
            }
            return sum;
        };

        Callable callable2= ()->{
            int sum=0;
            for(int i=arr.length/2;i<arr.length;i++){
                sum=sum+arr[i];
            }
            return sum;
        };

        List<Callable<Integer>> callableList= new ArrayList<>();
        callableList.add(callable1);
        callableList.add(callable2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures = executorService.invokeAll(callableList);

        int k=0;
        int sum=0;


        for(Future<Integer> f : futures){
            sum+=f.get();
            System.out.println("Callable "+ ++k +" " +sum);

        }

        System.out.println("Executor sum " +sum);
        System.out.println("stream sum " +total);

        executorService.shutdownNow();


    }


}
