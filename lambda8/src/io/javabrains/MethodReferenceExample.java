package io.javabrains;

public class MethodReferenceExample {

    public static void main(String[] args){

        Thread t = new Thread(MethodReferenceExample::printMessage); // equals to  new Thread(()-> printMessage())
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello!");
    }
}
