package learningAbstractAndInterface.Abstract;


public class daughter extends Parent {
    @Override
    void career(String name) {

        System.out.println("i am a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love  " + name + " he is "+age);

    }
}
