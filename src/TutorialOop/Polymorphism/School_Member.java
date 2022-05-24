package TutorialOop.Polymorphism;

public class School_Member {
    private String name;
    private int age;
    private String address;
    private int membersId;

    public School_Member(String name, int age, String address, int membersId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.membersId = membersId;
        System.out.println("A school member was initialized");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getMembersId() {
        return membersId;
    }
}
