package chapter4TddClass;

public class CreditCalculator {
    private final int accountNumber;
   private final int balanceBeginning;
   private final int totalOfCharges;
    private final int allowCreditLimit;
    private final int totalCreditsOfAccount;


    public CreditCalculator(int accountNumber, int balanceBeginning,
                            int totalCreditsOfAccount,int totalOfCharges,
                             int allowCreditLimit) {
        this.accountNumber = accountNumber;
        this.balanceBeginning = balanceBeginning;
        this.totalOfCharges = totalOfCharges;
        this.allowCreditLimit = allowCreditLimit;
      this.totalCreditsOfAccount = totalCreditsOfAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

   public int getBalanceAtTheBeginningOfTheMonth() {
       return balanceBeginning;
  }

   public int getTotalOfCharges() {
       return totalOfCharges;
    }

    public int getAllowCreditLimit() {

            return allowCreditLimit;
    }

    public int getTotalCreditsOfAccountThisMonth() {
        return totalCreditsOfAccount; }

    public int calculatedNewBalance() {

        return balanceBeginning + totalOfCharges - totalCreditsOfAccount;

    }
    public void displayNewBalance(int balanceBeginning,int totalOfCharges,int totalCreditsOfAccount){

        if (calculatedNewBalance() > allowCreditLimit){
            System.out.println( "credit limit exceeded");
        }
    }
}
