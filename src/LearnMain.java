public class LearnMain {
    public static void main(String[] args) {
        Learn doSomething = new Learn("Love",12,12.7);
        System.out.println(doSomething.getName()+ " "+ doSomething.getAge()+
                " "+doSomething.getHeight());
        doSomething.setName("Love");
        doSomething.setAge(19);
        doSomething.setHeight(14.8);
        System.out.printf("The new name is %s\n",doSomething.getName());
        System.out.printf("The new age is %d%n",doSomething.getAge());
        System.out.printf("The new height is %.2f%n",doSomething.getHeight());
    }
}
