package TutorialOop;



import java.util.HashMap;
import java.util.Map;

public class TheRomanNumerals {
    private int number;
   private int[] numbers;


    public int getNumber() {
        return number;
    }

    public void setNumber(int index) throws Exception {

        for (int i = 0; i < numbers.length; i++) {
            numbers[index] += i;
            System.out.println(numbers[i]);

            if (number >= 0 && number <= 10) {
                this.number = numbers[i];
            } else
                throw new Exception("number not recognized");
        }
    }
    public String getRomanNumerals(){
//        HashMap<Integer,String>romanNumerals = new HashMap<>(
//       Map.of(1,"I",2,"II",3,"III",4,"IV",5,"V",6,"VI",7,"VII",8,"VIII",9,"IX",10,"X"));

        return String.valueOf(number);
    }
    public void setRomanNumerals(String[] roman_number)throws Exception {
        for (int i = 0; i < roman_number.length; i++) {
            System.out.println(roman_number[i]);
            if (number >= 0 && number <= 10) {
                this.number = Integer.parseInt(roman_number[i]);
            } else
                throw new Exception("number not recognized");
        }
//        HashMap<Integer,String>romanNumerals = new HashMap<>(
//                Map.of(1,"I",2,"II",3,"III",4,"IV",5,"V",6,"VI",7,"VII",8,"VIII",9,"IX",10,"X"));


    }

    public static void main(String[] args) throws Exception {

        TheRomanNumerals romanNumbers = new TheRomanNumerals();
        romanNumbers.setNumber(10);
        System.out.println(romanNumbers.getNumber());
        System.out.println(romanNumbers.getRomanNumerals());



    }

}
