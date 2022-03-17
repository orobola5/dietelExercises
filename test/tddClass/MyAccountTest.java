package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyAccountTest {
    @Test
    public void testThatAccountCanBeCreated(){
        MyAccount loveAccount = new MyAccount();
        assertNotNull(loveAccount);

    }
    @Test
    public void testThatAccountHaveAName(){
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.setName("Olanrewaju Love");
        //check that(assertion)
        assertEquals("Olanrewaju Love",loveAccount.getName());
    }

    @Test
    public void testThatAccountHaveANumber() {
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.setNumber("0128052096");
        //check that(assertion)
        assertEquals("0128052096", loveAccount.getNumber());
    }
    @Test
    public void testThatAccountCanDeposit(){
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(500);
        //check that(assertion)
        assertEquals(500,loveAccount.getAmount());

    }

    @Test
    public void testThatAccountCanDepositMultipleTimes(){
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(500);
        loveAccount.deposit(500);
        loveAccount.deposit(1000);
        loveAccount.deposit(1000);
        //check that(assertion)
        assertEquals(3000,loveAccount.getAmount());

    }
    @Test
    @DisplayName("Test That Negative Deposit Will Not work")
    public void testThatNegativeDepositWillNotWork() {
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(500);
        loveAccount.deposit(-500);
        loveAccount.deposit(-5000);
        loveAccount.deposit(-100);
        //check that(assertion)
        assertEquals(500, loveAccount.getAmount());
    }
    @Test
    public void testThatWithdrawalWillWork() {
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(1000);
        loveAccount.withdraw(500);
        //check that(assertion)
        assertEquals(500, loveAccount.getAmount());
    }
    @Test
    public void testThatWeCanWithdrawalMultipleTimes() {
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(10000);
        loveAccount.withdraw(500);
        loveAccount.withdraw(500);
        loveAccount.withdraw(500);
        loveAccount.withdraw(500);
        //check that(assertion)
        assertEquals(8000, loveAccount.getAmount());
    }
    @Test
    @DisplayName("Test That Negative Withdrawal Will Not work")
    public void testThatNegativeWithdrawalWillNotWork() {
        //given that
        MyAccount loveAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(200);
        loveAccount.withdraw(-1000);
        loveAccount.withdraw(-1500);
        loveAccount.withdraw(-5500);
        loveAccount.withdraw(-500);
        //check that(assertion)
        assertEquals(200, loveAccount.getAmount());


    }
    @Test
    public void testThatTransferWillWork() {
        //given that
        MyAccount loveAccount = new MyAccount();
        MyAccount kelAccount = new MyAccount();
        MyAccount peaceAccount = new MyAccount();
        //when(action)
        loveAccount.deposit(2000);
        loveAccount.transfer(500, kelAccount);
        loveAccount.transfer(1000,peaceAccount);
        //check that(assertion)
        assertEquals(500, loveAccount.getAmount());
        assertEquals(500,kelAccount.getAmount());
        assertEquals(1000,peaceAccount.getAmount());
    }

}
