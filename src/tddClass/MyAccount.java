package tddClass;

public class MyAccount {
    private String name;
    private int amount;
    private String number;

    public MyAccount(String name, int amount, String number) {
        this.name = name;
        this.amount = amount;
        this.number = number;
    }

    public void setName(String acName) {
        this.name = acName;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amountToDeposit) {
        if (amountToDeposit >= 0) {
            this.amount += amountToDeposit;
        } else {
            System.out.println("You can not deposit negative amount");
        }
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= amount && amountToWithdraw >= 0) {
            amount -= amountToWithdraw;
        } else {
            System.out.println("Insufficient funds, please kindly deposit some funds");
        }

    }

    public int getAmount() {
        return amount;
    }

    public void transfer(int amountToTransfer, MyAccount receiverAccount) {
        this.amount -= amountToTransfer;
        receiverAccount.deposit(amountToTransfer);
    }

    public void setNumber(String accNumber) {
        this.number = accNumber;
    }

    public String getNumber() {
        return number;
    }
@Override
    public String toString() {
        String toReturn = String.format("""
                Account Name:    %s
                Account Number:  %s
                Balance:         %d
                """, name,number,amount);
        return toReturn;
    }

}