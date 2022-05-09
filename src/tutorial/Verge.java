package tutorial;

public class Verge {
    public int add(int...numbers){
        int total = 0;
        for (int number:numbers){
            total +=number;
        }
        return total;
    }
}
