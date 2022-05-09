package chapter4TddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalcTest {
    @Test
    void testThatCalcSalesComCanBeCreated() {
        SalesCommissionCalc calc = new SalesCommissionCalc();
        assertNotNull(calc);
    }

    @Test
    void testThatItemsCanBeSold() {
        SalesCommissionCalc calc = new SalesCommissionCalc();
        calc.itemCount( 289.45);
        assertEquals(289.45,calc.getItemCount());


    }

}
