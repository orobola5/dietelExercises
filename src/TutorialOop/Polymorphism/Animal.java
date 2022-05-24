package TutorialOop.Polymorphism;
public class Animal extends LivingThings {
    private String name;
    private String walk;

    public Animal(String name, String walk) {
        this.name = name;
        this.walk = walk;
    }

    public String getName() {
        return name;
    }

    public String move()
    {
        return "move like animal";
    }
}
