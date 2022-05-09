package Chapter9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {
BasePlusCommissionEmployee basePlusEmployee;
@BeforeEach
void setup(){
    basePlusEmployee = new BasePlusCommissionEmployee("Hilly","Lauretta",24,
            345_67,500.0,0.05,1000);

}
    @Test
    void testThatEmployeeHaveAName() {
        basePlusEmployee.setName("Hilly ","Peace");
        assertEquals("Hilly Peace",basePlusEmployee.getName());
    }

    @Test
    void testThatEmployeeHaveAge() {
    basePlusEmployee.setName("Hilly","Peace");
    basePlusEmployee.setAge(24);
    assertEquals(24,basePlusEmployee.getAge());
    }

    @Test
    void testTheEmployeeSecurityNo() {
    basePlusEmployee.setName("Hilly","Peace");
    basePlusEmployee.setAge(24);
    basePlusEmployee.setSecurityNo(456_90);
    assertEquals(456_90,basePlusEmployee.getSecurityNo());
    }

    @Test
    void testToGetEmployeeGrossSales() {
        basePlusEmployee.setName("Hilly","Peace");
        basePlusEmployee.setAge(24);
        basePlusEmployee.setSecurityNo(456_90);
        basePlusEmployee.setGrossSales(1000.0);
        assertEquals(1000.0,basePlusEmployee.getGrossSales());
    }

    @Test
    void testToGetCommissionRate() {
        basePlusEmployee.setName("Hilly","Peace");
        basePlusEmployee.setAge(24);
        basePlusEmployee.setSecurityNo(456_90);
        basePlusEmployee.setGrossSales(1000.0);
        basePlusEmployee.setCommissionRate(0.50);
        assertEquals(0.50,basePlusEmployee.getCommissionRate());
    }

    @Test
    void testToGetBaseSalary() {
        basePlusEmployee.setName("Hilly","Peace");
        basePlusEmployee.setAge(24);
        basePlusEmployee.setSecurityNo(456_90);
        basePlusEmployee.setGrossSales(1000.0);
        basePlusEmployee.setCommissionRate(0.50);
        basePlusEmployee.setBaseSalary(5000.0);
        assertEquals(5000.0,basePlusEmployee.getBaseSalary());
    }


    @Test
    void testTheEmployeeEarning() {
        basePlusEmployee.setName("Hilly","Peace");
        basePlusEmployee.setAge(24);
        basePlusEmployee.setSecurityNo(456_90);
        basePlusEmployee.setGrossSales(1000.0);
        basePlusEmployee.setCommissionRate(0.50);
        basePlusEmployee.setBaseSalary(5000.0);
        assertEquals(5500.0,basePlusEmployee.earning());
    }


    @Test
    void testToString() {
        basePlusEmployee.setName("Hilly","Peace");
        basePlusEmployee.setAge(24);
        basePlusEmployee.setSecurityNo(456_90);
        basePlusEmployee.setGrossSales(1000.0);
        basePlusEmployee.setCommissionRate(0.50);
        basePlusEmployee.setBaseSalary(5000.0);
        System.out.println(basePlusEmployee.toString());
        System.out.println(basePlusEmployee.earning());
    }
}