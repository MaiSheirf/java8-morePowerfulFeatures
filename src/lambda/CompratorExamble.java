package lambda;

import java.util.Comparator;

public class CompratorExamble {

    public static void main(String [] args){

        //prior java
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(3,2));

        //java 8

        Comparator<Integer> compLambda = (Integer a , Integer b) -> a.compareTo(b);
        System.out.println(compLambda.compare(3,2));

        Comparator<Integer> compLambda2 = (a,b) -> a.compareTo(b);
        System.out.println(compLambda2.compare(3,2));

    }
}
