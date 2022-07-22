package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

    public class IteratorPractice {
        public static void main(String[] args) {
            Collection<Integer> collection1 = new ArrayList<>();
            collection1.add(2);
            collection1.add(5);
            collection1.add(5);
            collection1.add(5);
            collection1.add(13);
            collection1.add(5);
            collection1.add(4);
            collection1.add(5);
            collection1.add(7);

            Collection<Integer> unique = new ArrayList<>();
            unique.add(2);
            unique.add(5);
            unique.add(7);

//        while (iterator.hasNext()){
//            if (unique.contains(iterator.next())){
//                iterator.remove();
//            }
//        }


//        collection1.removeIf(element -> unique.contains(element));


            collection1.removeIf(unique::contains);

            System.out.println("Collection 1 --> " + collection1);
        }

}
