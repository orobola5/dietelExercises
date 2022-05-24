package TutorialOop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Animal animal = randomAnimal();
            System.out.println("Animal #" + i + ":" + animal.getName() + "\n" + "move:" + animal.move() + "\n");
        }
           Goat goat = new Goat();
            goat.chewing();
            Cow cow = new Cow();
            cow.eat();



    }
    public static Animal randomAnimal(){
        int randomNumber = (int) ((Math.random()*3) + 1);
        System.out.println("the Random Number Generated was:"+randomNumber);
        return switch (randomNumber) {
            case 1 -> new Goat();
//                System.out.println(new Goat());
            case 2 -> new Cow();
//                System.out.println(new Cow());
            case 3 -> new Cat();
            default ->
//                System.out.println(new Cat());

                    null;
        };
    }
}
