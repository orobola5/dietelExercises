package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    private Bank gtBank;
    @BeforeEach
    public void setUp(){
        gtBank = new Bank("GtBank",10);
    }
    @Test
    public void bankCanBeCreated(){
        Bank gtBank = new Bank("GtBank",10);
        assertNotNull(gtBank);
        assertEquals("GtBank",gtBank.getName());
        assertEquals(10,gtBank.getMaximumNumberOfCustomers());

    }
    @Test
    public void bankCanCreatedAccount(){
       gtBank.createAccountFor("Saheed","Osupa","1234");
       gtBank.createAccountFor("wasiu","Osupa","1234");
       gtBank.createAccountFor("love","Olanrewaju","7684");
       assertEquals(3,gtBank.getNumberOfCustomers());
    }
    @Test
    public void createAccountCheckForCustomerByAccountNumberTest(){
        gtBank.createAccountFor("Saheed","Osupa","1234");
        gtBank.createAccountFor("wasiu","Osupa","1334");
        gtBank.createAccountFor("love","Olanrewaju","7684");
        assertEquals(3,gtBank.getNumberOfCustomers());
        MyAccount account = gtBank.findAccount(3);
        assertEquals(3,gtBank.getNumberOfCustomers());

    }
    @Test
    public void bankCanDepositMoneyTest(){
        gtBank.createAccountFor("love","olanrewaju","1234");
        gtBank.deposit(1200,"1");
        MyAccount loveAccount = gtBank.findAccount(1);
        assertEquals(1200,loveAccount.getAmount());

    }
    @Test
    public void bankCanWithDrawMoneyTest(){
        gtBank.createAccountFor("love","olanrewaju","1234");
        gtBank.deposit(1200,"1");
        MyAccount loveAccount = gtBank.findAccount(1);
        assertEquals(1200,loveAccount.getAmount());

        gtBank.withDraw(200,"1");
        assertEquals(1000,loveAccount.getAmount());
    }
    @Test
    public void bankCanTransferMoneyTest(){
        gtBank.createAccountFor("Saheed","Osupa","1234");
        gtBank.createAccountFor("wasiu","Osupa","1334");

        gtBank.deposit(12000,"1");

        MyAccount loveAccount = gtBank.findAccount(1);
        assertEquals(12000,loveAccount.getAmount());

        gtBank.transfer(200,"1","2","1234");
        loveAccount = gtBank.findAccount(1);
        assertEquals(11800,loveAccount.getAmount());

         loveAccount = gtBank.findAccount(2);
        assertEquals(200,loveAccount.getAmount());
    }


}
