package TutorialOop.Exercises;

import java.util.Scanner;

public class Pet {
    private  String kind;
    private int legs_number;

    public Pet(String kind, int legs_number) {
        this.kind = kind;
        this.legs_number = legs_number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) throws Exception{
        if(this.kind == null)System.out.println("error for empty value");
        else  this.kind = kind;
    }

    public int getLegs_number() {
        return legs_number;
    }

    public void setLegs_number(int legs_number)throws Exception {
        if(this.legs_number<0) System.out.println("error");
        else this.legs_number = legs_number;

    }

    public void start_running(){
        System.out.println("pet is running");
    }
    public void stop_running(){
        System.out.println("pet stopped");

    }

    public static void main(String[] args) throws Exception {

        Pet dog = new Pet("Bull dog",4);
        System.out.println(dog.kind);
        System.out.println(dog.legs_number);
        dog.start_running();
        dog.stop_running();
        dog.setKind(null);
        System.out.println(dog.getKind());
        dog.setLegs_number(-1);
        System.out.println(dog.getLegs_number());
//        Pet monkey = new Pet();

    }
}
