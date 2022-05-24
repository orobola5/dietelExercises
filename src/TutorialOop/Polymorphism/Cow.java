package TutorialOop.Polymorphism;

public class Cow extends Animal{
    public Cow() {
        super("milky cow","cow_walk");
    }

    @Override
    public String move(){
        return "she moves in a  cow_style";
    }

    public void eat(){

        System.out.println("cow eat anything");
    }
}
