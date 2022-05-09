package Chapter8oop;

class Calculator {
    public int add(int i, int j) {
        return i + j;
    }

}
class MethodAdv extends Calculator {
    public int sub(int i, int j) {
        return i - j;
    }

}
class MethodVeryAdv extends MethodAdv{
    public int multiply( int i, int j){
        return i*j;

    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        MethodVeryAdv methodTest = new MethodVeryAdv();
        int result1 = methodTest.add(10, 2);
        int result2 = methodTest.sub(20, 6);
        int result3 = methodTest.multiply(5,8);
        System.out.println(result1 * result2+ result3);
//        System.out.println(result2);
//        System.out.println(result3);
    }
}
