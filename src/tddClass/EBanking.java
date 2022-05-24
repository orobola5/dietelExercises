package tddClass;

public class EBanking {

    private final String Account_Number;
    private int balance;
    private  String accountName;
    private final String password;


    public EBanking(String accountNumber, String firstName, String lastName, String password) {
        this.Account_Number = accountNumber;
        this.accountName= firstName+" "+lastName;
        this.password = password ;
    }

    public String getAccountNumber() {
        return Account_Number;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    public int getBalance(String password) {
        if(password.equals(this.password))
            return balance;
        return 0;
    }

    public void withDraw(int amountToWithdraw, String password) {
        if (amountToWithdraw <= balance && amountToWithdraw >= 0) {
            balance -= amountToWithdraw;
        } else {
            System.out.println("Insufficient funds, please kindly deposit some funds");
        }

    }

    public void transfer(int amountToTransfer, EBanking receiverAccount) {
            this.balance -= amountToTransfer;
            receiverAccount.deposit(amountToTransfer);
        }
    }

