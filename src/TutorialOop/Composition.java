package Chapter8oop;
   /* the concept of association,aggregation and composition
   association is a simple relationship with some objects and things
   e.g customer use shopping cart containing items...
   superclass->animal,bank
   subclass->dog,account
   dog is an animal
   aggregation is described as a relationship that which have
   e.g a car has a engine
   a bank has many account
   a school has many student*/

public class Composition {
    private String name;

 public Composition(String name){
    this.name = name;
}
public String getCompositionName(){
    return this.name;
}
}
 class person{
    private String name;
     public person(String name){
        this.name = name;
     }
     public  String getPersonName(){
         return this.name;
     }
}
class Association{
    public static void main(String[] args) {
        Composition bank = new Composition("Loventure");
        person love  = new person("lauretta");
        System.out.println(love.getPersonName() + " is a user of " + bank.getCompositionName() +" Bank ");
    }

}
