package Chapter11;

public class Messenger {
    public  Beans buyBeans(int amount,boolean withOmiEwa,boolean isFake){
        return sendSomebodyElse(amount,withOmiEwa,isFake);

    }

    private Beans sendSomebodyElse(int amount, boolean withOmiEwa, boolean isFake) {
        if(amount<50) throw  new NullPointerException("you no get money abi");
        if(isFake) throw new IllegalArgumentException("your money be fake o");
        return new Beans(amount,withOmiEwa);

    }

}
