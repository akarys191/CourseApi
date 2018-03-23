package io.javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingLandExample {
    public static void main(String[] args){
            int[] sortNumbers={10,55,31,6};
            int key = 0;

            process(sortNumbers,key, wrapperLambda((v,k) -> System.out.println(v/k)));


    }

    private static void process(int[] numbers, int key, BiConsumer<Integer,Integer> consumer){
        for(int i:numbers)
        {
            consumer.accept(i,key);
        }

    }

    private static BiConsumer<Integer,Integer>  wrapperLambda(BiConsumer<Integer,Integer> consumer){

        return (v,k) -> {
            try {
                consumer.accept(v, k);
            }
            catch(ArithmeticException e){
                System.out.println(" Exception message is ---> "+e.getMessage());
            }
        };
    }
}
