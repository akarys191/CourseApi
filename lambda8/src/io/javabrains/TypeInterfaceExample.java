package io.javabrains;

public class TypeInterfaceExample {
    public static void main(String[] args){
        printWorld(s -> s.length());
    }

    public static void printWorld(StringLengthLambda l){
        System.out.println(l.getLength("Helo World!"));
    }

    public interface StringLengthLambda{
        int getLength(String s);
    }
}
