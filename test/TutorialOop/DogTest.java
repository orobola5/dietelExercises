package Chapter8oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testThatDogHaveName() {
        Dog dog = new Dog("Boo","White",'M',3);
        assertEquals("Boo",dog.getName());
    }

    @Test
    void testTheDogHaveColor() {
        Dog dog = new Dog("Boo","White",'M',3);
        assertEquals("White",dog.getColor());
    }

    @Test
    void testTheDogHaveGender() {
        Dog dog = new Dog("Boo","White",'M',3);
        assertEquals('M',dog.getGender());
    }

    @Test
    void testTheDogHaveCanineAge() {
        Dog dog = new Dog("Boo","White",'M',3);
        assertEquals(27,dog.getCanineAge(9));
    }

    @Test
    void testThatDogCanBark() {
        Dog dog = new Dog("Boo","White",'M',3);
        dog.bark();
        assertEquals("woof woof",dog.dogBark());
    }
    @Test
    void testThatGoldenRetrieverHasDogAttribute(){
        GoldenRetrievers golden = new GoldenRetrievers("Wizzy","Golden",'F',2);
        assertEquals("Wizzy",golden.getName());
        assertEquals("Golden",golden.getColor());
        assertEquals('F',golden.getGender());
        assertEquals(16,golden.getCanineAge(8));
        golden.bark();
        assertEquals("woof woof",golden.dogBark());


    }
}