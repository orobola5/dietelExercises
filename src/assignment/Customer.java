package assignment;

public class Customer {
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private int password;
    private int phoneNumber;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        if (this.password==password){
            System.out.println("access accep");
        }

    }
}