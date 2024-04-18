package Java8.realexample;

public interface AbstractFactory {
    public abstract BankAccount getBankAccount(int id, double balanace, String accountName);
}
