package io.javabrains;

public class Greater {
    public void greet(Greeting greeting){
        /*System.out.println(" Hello World! ");*/
        greeting.perform();
    }
    public static void main(String[] args){
        Greater greater = new Greater();
        Greeting myLambdaFunction = () -> System.out.println("Hello World!");
        myLambdaFunction.perform();
        MyAdd myAddFunction = (int a, int b) -> a + b;
    }

    interface MyAdd{
        int foo(int a, int b);
    }
}
