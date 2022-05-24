package TutorialOop.Polymorphism;

public class Cat extends Animal {
    public Cat() {
        super("Pussy cat","Cat_walk");

    }

    @Override
    public String move() {
        return"she cat_walk";
    }
}
