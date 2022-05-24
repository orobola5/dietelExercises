package TutorialOop.SchoolMember;

import TutorialOop.Polymorphism.Student;

import java.util.Arrays;

public class SchoolMain {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr Komolafe", 35, "no,45 job strt", 123, 150.0);
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        Student student = new Student(" John hilly",12,"455",203,new int[]{90,84,65});
        for (int grade: student.grades){
            System.out.print(Arrays.toString(new int[]{grade}));
            System.out.println(student.getName());
        }
    }
}