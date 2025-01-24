package java8interviewprograms;

public class ExampleFunction {

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Only positive numbers are allowed");
            return -1; // Indicate an error for negative input
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(-1);
        if (result != -1) {
            System.out.println(result);
        }
    }
}

