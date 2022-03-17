package tutorial;

public class Account {

    private String name;
    private String accountNumber;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
