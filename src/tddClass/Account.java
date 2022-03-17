package tddClass;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if (amount < 0)
        {
            amount = 0;
        }
        balance = amount + balance;

    }

    public int getBalance() {
        return 0;

    }

    public void withdraw(int amount) {
        if (amount > balance)
        {
            balance = amount + balance;
        }
    }
}