package iterator;

import java.util.*;

public class ComparatorPractice {
    static class FirstNameComparator implements Comparator<Employee> {


        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.firstName.compareTo(o2.firstName);
        }
    }

    static class Employee implements Comparable<Employee>{
        private String id;
        private String firstName;
        private String lastName;

        public Employee(String id, String firstName, String lastName){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int compareTo(Employee o) {
            if (this.lastName.equals(o.lastName)){
                if (this.firstName.equals(o.firstName)){
                    if (this.id.equals(o.id)){
                        return 0;
                    } else {
                        return this.id.compareTo(o.id);
                    }
                }else {
                    return this.firstName.compareTo(o.firstName);
                }
            }else {
                return this.lastName.compareTo(o.lastName);
            }
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }




    public static void main(String[] args) {
        Employee employee1 = new Employee("id1", "Amaka", "James");
        Employee employee2 = new Employee("id2", "Paul", "Peter");
        Employee employee3 = new Employee("id3", "John", "Jude");
        Employee employee4 = new Employee("id4", "Abbas", "Aliyu");
        List<Employee> collection = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4));
        Collections.sort(collection);
        System.out.println(collection);
    }
}


