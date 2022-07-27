package Chapter17Lambda.Stream;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person>people = getPeople();
//        filter
        List<Person> males= people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());

        males.forEach(System.out::println);

        //sort
        List<Person>sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
                .collect(Collectors.toList());
                sorted.forEach(System.out::println);
        //All match
       boolean allMatch = people.stream()
                .allMatch(person -> person.getAge()>);
        System.out.println(allMatch);
        //Any match
        //None match
        //Max
        //Min
        //Group
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Hilly lea","23","Engineer","50000000.0",Gender.FEMALE,Status.SINGLE),
                new Person("Smith Jones","28","Actor","38000000.0",Gender.FEMALE,Status.SINGLE),
                new Person("Laurel Tea","20","Brand Manager","5000000.0",Gender.FEMALE,Status.SINGLE),
                new Person("Korey Wise","45","CEO","1000000000.0",Gender.FEMALE,Status.SINGLE),
                new Person("Anton Mike","30","Driver","2000000.0",Gender.FEMALE,Status.SINGLE),
                new Person("Angelica Will","56","Counsellor","150000000.0",Gender.FEMALE,Status.SINGLE)
        );
    }
}
