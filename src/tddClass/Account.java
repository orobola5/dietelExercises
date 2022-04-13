package tddClass;

public class Account {

    private int balance;
    private String name;

    public Account(String accountNumber, String accountName, String lastName, int pin) {
        name = accountName;

    }

    public void setAccountName(String name) {
        this.name =name ;
    }

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

    public String getAccountName() {
        return name;
    }
}