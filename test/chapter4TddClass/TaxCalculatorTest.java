package chapter4TddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxCalculatorTest {
    @Test
    void testThatTaxCalculatorCanBeCreated() {
        TaxCalculator taxCalculator = new TaxCalculator();
        assertNotNull(taxCalculator);
    }

    @Test
    void testThatCitizensHasNames() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("love");
        taxCalculator.setNames("shade");
        taxCalculator.setNames("paul");
        int citizen = taxCalculator.number_of_citizen(3);
        assertEquals(3, citizen);
    }

    @Test
    void testThatEachCitizenEarnings() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("love");
        taxCalculator.setYear(2022);
        assertEquals(2022, taxCalculator.getYear());
        taxCalculator.setEarning(100_000);
        assertEquals(100_000, taxCalculator.getEarning());

    }

    @Test
    void testCitizen2Earning() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("Shade");
        taxCalculator.setYear(2021);
        assertEquals(2021, taxCalculator.getYear());
        taxCalculator.setEarning(30_000);
        assertEquals(30_000, taxCalculator.getEarning());
    }

    @Test
    void testCitizen3Earning() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("paul");
        taxCalculator.setYear(2020);
        assertEquals(2020, taxCalculator.getYear());
        taxCalculator.setEarning(15_000);
        assertEquals(15_000, taxCalculator.getEarning());
    }

    @Test
    void testTaxForCitizen1() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("love");
        taxCalculator.setYear(2022);
        assertEquals(2022, taxCalculator.getYear());
        taxCalculator.setEarning(100_000);
        assertEquals(100_000, taxCalculator.getEarning());
        double taxRate = taxCalculator.calculatedTax(20);
        assertEquals(20_000, taxRate);
    }

    @Test
    void testTaxCitizen2() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("Shade");
        taxCalculator.setYear(2021);
        assertEquals(2021, taxCalculator.getYear());
        taxCalculator.setEarning(30_000);
        assertEquals(30_000, taxCalculator.getEarning());
        double taxRate = taxCalculator.calculatedTax(15);
        assertEquals(4500.0, taxRate);
    }

    @Test
    void testTaxCitizen3() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setNames("paul");
        taxCalculator.setYear(2020);
        assertEquals(2020, taxCalculator.getYear());
        taxCalculator.setEarning(15_000);
        assertEquals(15_000, taxCalculator.getEarning());
        double taxRate = taxCalculator.calculatedTax(15);
        assertEquals(2250.0, taxRate);

    }

}
