package tddClass;

public class HeartRate {
    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private int dateOfBirth;


    /*public HeartRate(String firstname, String lastname, int dateOfBirth) {
        this.firstName = firstname;
        this.lastName = lastname;
//        this.age = age;
        this.dateOfBirth = dateOfBirth;*/

    public HeartRate(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=(day)/(month)/(year);
    }

    public void setFirstName(String firstname) {
        name = firstname;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastname) {
        name = lastname;
    }


    public int personAge() {
        int age = 2022 - 2002;
        this.age = age;
        return this.age;
    }

    public int heartRate() {
        int heartRate = 220 - personAge();
        return heartRate;

    }

    public double targetHeartRate() {
        return (50 * 0.01) * heartRate();


    }

    public void monthOfBirth(int month) {
        this.dateOfBirth = month;

    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = getDateOfBirth();

    }

    public void dayOfBirth(int day) {
        this.dateOfBirth =day;
    }

    public void yearOfBirth(int year) {
        this.dateOfBirth= year;
    }

}
