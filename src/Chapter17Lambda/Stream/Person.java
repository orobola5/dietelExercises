package Chapter17Lambda.Stream;

public class Person {
    private String name;
    private String age;
    private String occupation;
    private  String netWorth;
    private Gender gender;
    private Status status;



    public Person(String name,
                  String age,
                  String occupation,
                  String netWorth,
                  Gender gender,
                  Status status) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.netWorth = netWorth;
        this.gender = gender;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(String netWorth) {
        this.netWorth = netWorth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
