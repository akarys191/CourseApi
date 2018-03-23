package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Adil","Adilov","Astana"),
                new Person("CAdil3","CAdilov3","Astana"),
                new Person("BAdil4","CAdilov4","Astana"),
                new Person("CAdil2","Adilov2","Astana")
        );

        System.out.println(" Using for loop::: ");


       // people.forEach(p -> System.out.println(p));
        people.stream()
                .filter(p -> p.getfName().startsWith("C"))
                .forEach(p-> System.out.println(p.getfName()));


        long count = people.stream()
                .filter(p -> p.getfName().startsWith("C"))
                .count();

        System.out.println(count);



    }
}
