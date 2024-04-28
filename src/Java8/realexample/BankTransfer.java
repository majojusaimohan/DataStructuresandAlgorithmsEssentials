package Java8.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {

    public static void main(String args[]) {
        AbstractFactory accountfactory = BankAccount::new;
        BankAccount studentAccount = accountfactory.getBankAccount(1, 50000, "StudentAccount");
        BankAccount UniversityAccount = accountfactory.getBankAccount(2, 100000, "UniversityBankAccount");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) ->
                System.out.println("Ending balance of student Account" + studentAccount.getBalance()
                        + "Universtiy account : " + studentAccount.getBalance());

        ExecutorService service = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "says :: Executing Transfer");
            try {
                double amount = 1000;
                if (!p1.test(studentAccount.getBalance(), amount)) {
                    printer.accept(Thread.currentThread().getName() + " says :: balance insufficient,", amount);
                    return;
                }
                while (!studentAccount.transfer(UniversityAccount, amount)) {
                    TimeUnit.MICROSECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            printer.accept(Thread.currentThread().getName() + " says transer is suceefull Banlance in account ", +
                    UniversityAccount.getBalance());
        });
        for (int i = 0; i < 20; i++) {
            service.submit(t1);
        }
        service.shutdown();

        try {
            while (!service.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not Yet, Still waiting for Termination");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printer2.accept(studentAccount, UniversityAccount);
    }
}
