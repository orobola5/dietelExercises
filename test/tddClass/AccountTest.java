package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        //given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());

    }

        @Test
        public void depositTwiceTest() {

            Account funmiAccount = new Account();
            //when
            funmiAccount.deposit(500);
            funmiAccount.deposit(400);
            //assert
            assertEquals(900, funmiAccount.getBalance());

        }
        @Test
        @DisplayName("Test that negative deposit will not work")
        public void negativeDepositTest() {
            Account funmiAccount = new Account();
            //when
            funmiAccount.deposit(1000);
            funmiAccount.deposit(-500);
            //assert
            assertEquals(1000, funmiAccount.getBalance());


        }

    @Test
    public void withdrawalTest() {

        Account funmiAccount = new Account();
        //when
        funmiAccount.withdraw(500);
        //assert
        assertEquals(400, funmiAccount.getBalance());

    }

    }

