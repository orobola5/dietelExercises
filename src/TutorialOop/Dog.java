package TutorialOop;

public class Dog {
    private String name;
    private String color;
    private char gender;
    private int canineAge;

    public Dog(String name, String color, char gender, int canineAge) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.canineAge = canineAge;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public  int getCanineAge(int humanAge){
        return this.canineAge *humanAge;
    }
    public void bark(){
        System.out.println("woof! woof!!! i'm" + " "+ getName());
    }
    public String dogBark(){
        return "woof woof";
    }

}
class GoldenRetrievers extends Dog{

    public GoldenRetrievers(String name, String color, char gender, int canineAge) {
        super(name, color, gender, canineAge);
    }


}
