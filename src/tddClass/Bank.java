package tddClass;

public class Bank {
    private String name;
    private MyAccount[] accounts;
    private int numberOfCustomer;



    public Bank(String bankName,int numberOfCustomer){
        name = bankName;
        accounts = new MyAccount[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNumberOfCustomers() {
        return accounts.length;
    }

    public MyAccount createAccountFor(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        MyAccount loveAccount = new MyAccount(name, 0,"numberOfCustomer");
        accounts[numberOfCustomer]=loveAccount;
        numberOfCustomer++;


        return loveAccount;
    }

    public int getNumberOfCustomers() {

        return numberOfCustomer;
    }

    public MyAccount findAccount(int accountNumber) {
        int indexOfAccount = accountNumber -1;
        return accounts[indexOfAccount];
    }

    public void deposit(int amountToDeposit, String accountNumber ) {
        MyAccount loveAccount = findAccount(Integer.parseInt(accountNumber));
        loveAccount.deposit(amountToDeposit);
    }

    public void withDraw(int amountToWithdraw, String accountNumber) {
        MyAccount loveAccount =findAccount(Integer.parseInt(accountNumber));
        loveAccount.withdraw(amountToWithdraw);
    }

    public void transfer(int amount, String from, String to, String sendersPin) {
        MyAccount senderAccount = findAccount(Integer.parseInt(from));
        MyAccount receiverAccount = findAccount(Integer.parseInt(to));
        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);

    }
}
