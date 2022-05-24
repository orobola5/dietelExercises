package TutorialOop.Polymorphism;

public class LivingThings {
    private Animal animal;
    private Plant plant;

    public LivingThings(Animal animal, Plant plant) {
        this.animal = animal;
        this.plant = plant;
    }

    public LivingThings() {

    }


    public String move(){

        return "moving like a living thing";
    }
}
