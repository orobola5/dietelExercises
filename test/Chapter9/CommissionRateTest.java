package Chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionRateTest {
    CommissionRate Employee;

    @BeforeEach
    void setUp() {
         Employee = new CommissionRate("Simon","Peters",35, 333_35, 500.0,0.04);

    }

    @Test
    void testThatEmployeeHaveACommissionRate(){
        CommissionRate rate = new CommissionRate("Simon","Peters",35,
                333_35, 500.0,0.04);
        assertNotNull(rate);
    }

    @Test
    void testThatEmployeeHaveAName() {
        Employee.setName("Simon" ," Peters");
        assertEquals("Simon  Peters",Employee.getName());

    }


    @Test
    void getAge() {
        Employee.setName("Simon" ," Peters");
        Employee.setAge(28);
        assertEquals(28,Employee.getAge());
    }

    @Test
    void getSecurityNo() {
        Employee.setName("Simon" ," Peters");
        Employee.setAge(28);
        Employee.setSecurityNo(333_301);
        assertEquals(333_301,Employee.getSecurityNo());
    }



    @Test
    void getGrossSales() {
        Employee.setName("Simon" ," Peters");
        Employee.setAge(28);
        Employee.setSecurityNo(333_301);
        Employee.setGrossSales(450.0);
        assertEquals(450.0,Employee.getGrossSales());
    }



    @Test
    void getCommissionRate() {
        Employee.setName("Simon" ," Peters");
        Employee.setAge(28);
        Employee.setSecurityNo(333_301);
        Employee.setGrossSales(450.0);
        Employee.setCommissionRate(0.10);
        assertEquals(0.10,Employee.getCommissionRate());

    }


    @Test
    void earning() {
        Employee.setGrossSales(450.0);
        Employee.setCommissionRate(0.05);
        assertEquals(22.5,Employee.earning());

    }

    @Test
    void testToString() {
        Employee.setName("Simon" ," Peters");
        Employee.setAge(28);
        Employee.setSecurityNo(333_301);
        Employee.setGrossSales(450.0);
        Employee.setCommissionRate(0.10);
        System.out.println(Employee.toString());
        System.out.println(Employee.earning());
    }
}