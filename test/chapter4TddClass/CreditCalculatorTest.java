package chapter4TddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreditCalculatorTest {
    CreditCalculator mine;

    @BeforeEach
    public void setUp() {
        mine = new CreditCalculator(1245, 2000,
                350, 300, 300);

    }

    @Test
    public void createCreditCalculated() {
        assertNotNull(mine);

    }

    @Test
    public void getBalanceAtTheBeginningOfTheMonth() {
        assertEquals(2000, mine.getBalanceAtTheBeginningOfTheMonth());
    }

    @Test
    public void getAccountNumber() {
        assertEquals(1245, mine.getAccountNumber());
    }

    @Test
    void getTotalOfCharges() {
        assertEquals(300, mine.getTotalOfCharges());
    }

    @Test
    void getTotalCreditsOfAccountThisMonth() {
        assertEquals(350, mine.getTotalCreditsOfAccountThisMonth());
    }

    @Test
    public void getAllowCreditLimit() {
        assertEquals(300, mine.getAllowCreditLimit());
    }

    @Test
    public void calculateForNewAccountBalance() {
      CreditCalculator  mine = new CreditCalculator(1245, 2000, 350, 300, 300);
      mine.displayNewBalance(1000, 300, 250);
        assertEquals(1950, mine.calculatedNewBalance());
    }


}
