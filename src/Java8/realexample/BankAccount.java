package Java8.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int id;
    private double balance;
    private String accountName;
    final Lock lock = new ReentrantLock();

}
