public class Learn {
    private String name;
    private int age;
    private double height;

    public Learn(String name, int personAge, double height){
        this.name = name;
        age = personAge;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
