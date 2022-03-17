import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarApplicationTest {
    CarApplication car;

    @BeforeEach
    public void setUp(){
        car = new CarApplication("SUV","2021",567.98);
    }

    @Test
    public void carApplicationClassExist(){
        assertNotNull(car);
    }

    @Test
    public void modelAttributeCanBeCreated(){
        car.setModel("Toyota");
        assertEquals("Toyota", car.getModel());
    }

    @Test
    public void yearAttributeCanBeCreated(){

        car.setYear("2021");
        assertEquals("2021", car.getYear());
    }

    @Test
    public void priceAttributeCanBeCreated(){

        car.setPrice(59.65);
        assertEquals(59.65, car.getPrice());
    }

    @Test
    public void negativePriceValueIsNotSet(){
        car.setPrice(-59.65);
        assertEquals(0, car.getPrice());
    }

    @Test
    public void twoCarObjectsCanBeCreated(){
        CarApplication car1 = new CarApplication("SUV","2020",750.00);
        CarApplication car2 = new CarApplication("Toyota","2020",751.00);

        assertEquals(1,car1.getCount());
        assertEquals(1,car2.getCount());
//        assertEquals(2,car.getCount());

        assertEquals(750.00, car1.getPrice());
        assertEquals(751.00, car2.getPrice());
    }

    @Test
    public void discountCanBeCalculated(){
        CarApplication car1 = new CarApplication("SUV","2020",750.00);
        CarApplication car2 = new CarApplication("Toyota","2020",751.00);
        car1.setDiscount(5);
       assertEquals(37.5, car1.getDiscount());
       car2.setDiscount(7);
       assertEquals(52.57000000000001,car2.getDiscount());
    }
}
