package TutorialOop.Polymorphism;
import TutorialOop.Polymorphism.School_Member;
public class Student extends School_Member {
    public int [] grades = new int[3];

    public Student(String name, int age, String address, int studentId, int[] grades) {
        super(name, age, address, studentId);
        this.grades = grades;
        System.out.println(name);
    }
//    public int getGrades(){
//        return grades;


}
