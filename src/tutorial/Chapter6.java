package tutorial;

public class Chapter6 {
    private static String name;
    private int age;



    public Chapter6(String myName, int myAge){
        name = myName;
        age = myAge;
    }
    public Chapter6(String name){

        this(name,0);
    }
    public Chapter6(){

    }

    public final String letsMove(){
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Chapter6.name = name;
    }
    public int setName(String name, int age){
       return  0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

        letsPlay("something");
    }

    public static void main(String[] args) {
    Chapter6 something = new Chapter6();
    something.setAge(12);
        System.out.println(something.getAge());
letsPlay("something");

    }
    public static void letsPlay(String call){
        name = "fine girl";
        for (int i = 0; i < call.length(); i++) {
            System.out.print(call.charAt(i) + " ");
        }
        System.out.println();
    }
}
