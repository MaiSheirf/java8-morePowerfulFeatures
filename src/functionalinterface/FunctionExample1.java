package functionalinterface;

public class FunctionExample1 {

    public static String appendDefault(String input){

        return FunctionExample.addSomeString.apply(input);
    }

    public static void main(String[] args) {
        System.out.println(FunctionExample1.appendDefault("mai"));
    }
}
