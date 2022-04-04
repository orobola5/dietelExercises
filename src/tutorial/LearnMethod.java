package tutorial;

public class LearnMethod {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score =800;
        int levelCompleted =5;
        int bonus = 100;

       calculatedScore(true,800,5,100);
       calculatedScore(true,10000,8,200);


       

    }
    public static void calculatedScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver){
            int finalScore = score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("your final score was :" +finalScore);
        }

    }
}
