package DataStructure.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {


    @Test void test_that_salaries_is_null(){
        HashMap<String, Number> salaries = new HashMap<>();
        assertNotNull(salaries);

    }
    @Test void test_that_employee_have_different_salary(){
        HashMap<String, Integer> salaries = new HashMap<>();
      salaries.put(200,"pm");
        assertEquals(200,"pm",salaries.get());
         
    }

}