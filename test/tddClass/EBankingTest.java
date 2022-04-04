package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EBankingTest {
    @Test
    public void accountCanBeCreatedTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        assertNotNull(account);
    }
    @Test
    public void accountCanBeCreatedWithAllDetailsTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        assertEquals("56565",account.getAccountNumber());
        assertEquals("flo funmi",account.getAccountName());

    }
    @Test
    public void accountDepositTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        account.deposit(500);
        assertEquals(500,account.getBalance("45654"));

    }
    @Test
    public void accountDepositMultipleTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        account.deposit(500);
        account.deposit(200);
        assertEquals(700,account.getBalance("45654"));

    }

    @Test
    public void accountWithDrawWithRightPinTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        account.deposit(500);
        account.withDraw(200,"45654");
        assertEquals(300,account.getBalance("45654"));

    }
    @Test
    public  void accountCanTransferTest(){
        EBanking  account = new EBanking("56565","flo","funmi","45654");
        EBanking kelAccount = new EBanking("56567","kel","okon","3421");
        EBanking peaceAccount = new EBanking("7856","peace","olanrewaju","4578");
        account.deposit(2000);
        account.transfer(500, kelAccount);
        account.transfer(1000,peaceAccount);
        assertEquals(500, account.getBalance("45654"));
        assertEquals(500,kelAccount.getBalance("3421"));
        assertEquals(1000,peaceAccount.getBalance("4578"));
    }

}

