package TutorialOop.Employee;
/* imagine you been asked to work on an employee class and ur click already
* written the class but u discover that  some important attribute are not added
* instead of rewriting the code again we can create a class that is related to the former class
* and add our new attribute...they will share the same attribute and methods among themselves
* the new class we are working on will inherit the old class attribute and behaviour,but also have their own attribute and behaviour */
//This is the Superclass
public class Employee{
    private String name;
    private  String number;

    public Employee(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
