package lambda;

public class RunnableExamble {
    public static void main(String [] args){

        //prior java

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 1");
            }
        };
        new Thread(runnable).start();

        //lambda expression

        Runnable runLambda = () -> {
            System.out.println("inside runnable 2");
        };
        new Thread(runLambda).start();

        Runnable runSingle = () -> System.out.println("inside runnable 3");
        new Thread(runSingle).start();

        Runnable runMulti = () -> {
            System.out.println("inside runnable 4");
            System.out.println("inside runnable 4");
        };
        new Thread(runMulti);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 5");
            }
        }).start();

        new Thread(()-> System.out.println("inside runnable 6")).start();

    }
}
