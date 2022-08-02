package DataStructureWithUdemy.Gaming;

public class GuessTheWord {
private boolean play;
private Words randomWord= new Words();

    public void  start(){

        do{
            showWord();
            getInput();
            ceckinput();
        }while (play);
    }
    void  showWord(){
        System.out.println(randomWord);
    }
    void getInput(){
        System.out.println("getInput");
    }
    void ceckinput(){
        System.out.println("check input");
    }
}
