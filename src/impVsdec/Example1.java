package impVsdec;

import java.util.stream.IntStream;

public class Example1 {
    public static void main(String []args){

        //imp
        int sum = 0;
        for(int i =0 ; i <100; i++){
            sum+=i;
        }
        System.out.println(sum);

        //dec
        int sum1 =IntStream.range(0,100).parallel().sum();
        System.out.println(sum1);
    }
}
