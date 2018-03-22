package io.javabrains;

public class RunnableExample {
    public interface StringLengthLambda{
    }

    public static void main(String[] args){

        Thread test = new Thread(){
            public void run(){
                System.out.println(" Thread run example");
            }
        };

        test.run();

        Thread test2 = new Thread(() ->  System.out.println(" Thread run example"));
        test2.run();


    }


}
