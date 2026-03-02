package BankClass;

public class Bank {
    public double deposit(double balance, double amount)
    {
        return (amount+balance);
    }
    public double withdraw(double balance, double amount)
    {
        return (balance-amount);
    }
}
