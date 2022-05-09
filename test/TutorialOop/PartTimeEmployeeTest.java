package Chapter8oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTimeEmployeeTest {
    @Test
    void testThatEmployeeHasAName(){
        Employee employee = new Employee("chibuzo","0803");
        assertEquals("chibuzo",employee.getName());
        assertEquals("0803",employee.getNumber());
    }

    @Test
    @DisplayName("testThatPartTimeEmployeeInheritAllTheAttributeOfEmployee")
    void testThatPartTimeEmployeeCanGetHourlyPay() {
        PartTimeEmployee employee = new PartTimeEmployee("Tunde","1234",2500);
        assertEquals("Tunde",employee.getName());
        assertEquals("1234",employee.getNumber());
        assertEquals(2500,employee.getHourlyPay());

        employee.setHourlyPay(700);
        assertEquals(700,employee.getHourlyPay());
    }


    @Test
    void testThatPartTimeEmployeeCanCalculateWeeklyPay() {
        PartTimeEmployee employee = new PartTimeEmployee("Tunde","1234",2500);
        employee.setHourlyPay(700);
        assertEquals(16800,employee.calculateWeeklyPay(24));
    }

    }
