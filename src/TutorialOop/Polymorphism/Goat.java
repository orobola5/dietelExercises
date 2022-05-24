package TutorialOop.Polymorphism;

public class Goat extends Animal{
    public Goat() {
        super("She_Goat","Goat_Walk");
    }


    @Override
    public String move() {
        return "she moves in a Goat style";
    }
    public void chewing()
    {
        System.out.println(" Goat chew daily");
    }
}
