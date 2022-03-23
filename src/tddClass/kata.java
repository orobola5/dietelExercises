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
            number = number * 2000;
        } else if (number > 5 && number < 9) {
            number = number * 1800;
        } else if (number > 10 && number < 29) {
            number = number * 1600;
        } else if (number > 30 && number < 49) {
            number = number * 1500;
        } else if (number > 50 && number < 99) {
            number = number * 1300;
        } else if (number > 100 && number < 199) {
            number = number * 1200;
        } else if (number > 200 && number <= 499) {
            number = number * 1100;
        } else {
            number = number * 1000;
        }
        return number;
    }


    public int number(int quotient1, int quotient2) {
        return quotient1 / quotient2;

    }

    public boolean evenOrOdd(int number) {
        if (number == 2) {
            return true;
        } else {
            return false;
        }


    }


    public int biggestNumber(int number1, int number2, int number3, int number4, int number5) {

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
            //System.out.println("the biggest number is " + number1);
            return number1;
        } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
            // System.out.println("the biggest number is " + number2);
            return number2;
        } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            // System.out.println("the biggest number is " + number3);
            return number3;
        } else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
            //System.out.println("the biggest number is " + number4);
            return number4;
        } else {
            //System.out.println("the biggest number is" + number5);
            return number5;
        }

    }

    public int factorCount(int number) {
        int count = 1;
        int numb = 1;
        while (numb < number) {
            if (number % numb == 0) {
                count++;
            }
            numb++;
        }
        return count;
    }

    public boolean primeNumber(int number) {
        //int loop = 1;
        int factor = factorCount(number);
        if(factorCount(number) <=2)return true;
        return false;

    }
}


































