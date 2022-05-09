package tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    @Test
    void testThatLoanCanBeGranted(){
        Loan loan = new Loan(2.5,1,1000);
        assertNotNull(loan);
    }

    @Test
    void testToGetAnnualInterestRate() {
        Loan loan = new Loan(2.5,1,1000);
        loan.setAnnualInterestRate(5.8);
        assertEquals(5.8,loan.getAnnualInterestRate());

    }

    @Test
    void testNumberOfYearsForTheLoan() {
        Loan loan = new Loan(2.5,1,1000);
        loan.setNumberOfYears(2);
        assertEquals(2,loan.getNumberOfYears());
    }

    @Test
    void testTheLoanAmount() {
        Loan loan = new Loan(2.5,1,1000);
        loan.setLoanAmount(25000);
        assertEquals(25000,loan.getLoanAmount());

    }

    @Test
    void testToGetLoanDate() {
        Loan loan = new Loan(2.5,1,1000);
        loan.getLoanDate();
//       assertEquals();
    }

    @Test
    void getMonthlyPayment() {
        Loan loan = new Loan(2.5,1,1000);
        loan.setAnnualInterestRate(5.8);
        loan.setNumberOfYears(2);
        loan.setLoanAmount(25000);
        assertEquals(7250.00,loan.getMonthlyPayment());
    }

    @Test
    void getTotalPayment() {
        Loan loan = new Loan(2.5,1,1000);

    }
}