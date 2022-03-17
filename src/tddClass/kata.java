package tddClass;

public class kata {

    public int add(int number1, int number2) {
        int result = 0;
        result = number1 + number2;
        return result;
    }

    public int subtract(int number1, int number2) {
        int result = 0;
        result = number1 - number2;
        return result;

    }

    public int divide(int number1, int number2) {
        int result = 0;
        result = number1 / number2;
        return result;

    }

    public int multiply(int number1, int number2) {
        int result = 0;
        result = number1 * number2 / number1;
        return result;
    }


    public int square(int number) {
        int result = 0;
        result = number * number;
        return result;
    }

    public int copiesNumber(int number) {
        if (number > 1 && number <= 4) {
            number = number * 2000;}
        else if (number > 5 && number <9) {
            number = number * 1800;}
        else if (number > 10 && number <29) {
            number = number * 1600;
        } else if (number > 30 && number < 49) {
            number = number * 1500;
        } else if (number > 50 && number < 99) {
            number = number * 1300;
        } else if (number > 100 && number < 199) {
            number= number * 1200;
        } else if (number > 200 && number <= 499) {
            number= number * 1100;
        }  else {
            number = number * 1000;
        }
        return number;
    }


    public int number(int quotient1,int quotient2) {
        return quotient1/quotient2;


    }

    }





