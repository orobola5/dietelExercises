package TutorialOop.SchoolMember;

import TutorialOop.Polymorphism.School_Member;

public class Teacher extends School_Member {
    private final double salary;

    public Teacher(String name, int age, String address, int teacherId, double salary) {
        super(name, age, address, teacherId);
        this.salary = salary;
        System.out.println("A teacher was initialized");
    }
    public double getSalary(){
        return salary;
    }
}
