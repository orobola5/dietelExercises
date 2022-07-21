package learningAbstractAndInterface.Abstract;

public class main {
    public static void main(String[] args) {
        son mySon=new son();
        daughter myDaughter= new daughter();
        mySon.career("Lawyer");
        mySon.partner("ALex",22);

        myDaughter.career("Software Engineer");
        myDaughter.partner("Ronaldo",21);
    }
}
