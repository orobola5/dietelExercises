package TutorialOop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeStoreTest {
    EmployeeStore employeeStore;
    @BeforeEach
    void setUp(){
        employeeStore = new EmployeeStore("Alice","Cashier",35000.0);
    }
    @Test
    void testThatEmployeeStoreCanServeAsTheParentClass(){
        assertNotNull(employeeStore);
    }
    @Test
    void testThatEmployeeHaveName() {
        employeeStore.setName("Lauretta");
        assertEquals("Lauretta", employeeStore.getName());
    }
    @Test
    void testThatEmployeeHaveId() {
        employeeStore.setName("Lauretta");
        employeeStore.setId("SalesPerson Lauretta");
        assertEquals("SalesPerson Lauretta", employeeStore.getId());

    }
    @Test
    void testThatEmployeeGetSalaryPerMonth() {
        employeeStore.setName("Lauretta");
        employeeStore.setId("SalesPerson Lauretta");
        employeeStore.setSalary(75000.50);
        assertEquals(75000.50, employeeStore.getSalary());
    }

    @Test
    void testTheSalaryOfEmployeeInAYear(){
        employeeStore.setName("Lauretta");
        employeeStore.setId("SalesPerson Lauretta");
        employeeStore.setSalary(75000.50);
        assertEquals(1350009.0, employeeStore.calculateSalaryYearly(18));
    }

    @Test
    void getDiscount() {
        employeeStore.setName("Lauretta");
        employeeStore.setId("SalesPerson Lauretta");
        employeeStore.setSalary(75000.50);
        employeeStore.setDiscount(0.10);
        assertEquals(0.10, employeeStore.getDiscount());

    }
    @Test
    void testThatEmployeeGetRaise() {
        employeeStore.setName("Lauretta");
        employeeStore.setId("SalesPerson Lauretta");
        employeeStore.setSalary(75000.50);
        employeeStore.setDiscount(0.10);
        assertEquals(7500.05, employeeStore.getRaise());

    }
    @Test
    @DisplayName("testThatManagerIsASubclassOfEmployeeClass")
     void testThatManagerIsAnEmployee(){
        ManagerStore managerStore = new ManagerStore("Jasmine Gold","StoreManager",
                3500000.00, 5656,7);
        managerStore.setPassword(1234);
        assertEquals("Access granted",managerStore.getPassword(1234));
        //test that negative password will not work
        managerStore.setPassword(4545);
        assertEquals("Access denied",managerStore.getPassword(5656));

       managerStore.setNumberOfEmployeeManaged(2);
        assertEquals(2,managerStore.getNumberOfEmployeeManaged());
    }
    @Test
    void testTheSalaryOfManagerInAYear(){
        ManagerStore managerStore = new ManagerStore("Jasmine Gold","StoreManager",
                350000.00, 5656,7);
        assertEquals(8400000,managerStore.calculateSalaryYearly(24));
    }

    @Test
    void testTheManagerDiscount() {
        ManagerStore managerStore = new ManagerStore("Jasmine Gold","StoreManager",
                350000.00, 5656,7);
        employeeStore.setDiscount(0.25);
         assertEquals(0.25, employeeStore.getDiscount());

    }
    @Test
    void testThatManagerGetRaise() {
        ManagerStore managerStore = new ManagerStore("Jasmine Gold","StoreManager",
                350_000.00, 5656,7);
        managerStore.setDiscount(0.25);
        assertEquals(87500,managerStore.getRaise());

    }
    @Test
    void testThatDirectorIsAlsoASubclass(){
        DirectorStore directorStore = new DirectorStore("Desmond","MD",15000000.00,5674,
                10);
        assertEquals("Desmond",directorStore.getName());
        assertEquals("MD",directorStore.getId());
        assertEquals(15000000.00,directorStore.getSalary());
        assertEquals(1.8E8,directorStore.calculateSalaryYearly(12));
        directorStore.setDiscount(0.05);
        assertEquals(0.05,directorStore.getDiscount());
        assertEquals(750000.0,directorStore.getRaise());
        assertEquals(10,directorStore.getNumberOfEmployeeManaged());
        assertEquals("Access granted",directorStore.getPassword(5674));
        //test that negative password will not work
        assertEquals("Access denied",directorStore.getPassword(5656));


    }

}
