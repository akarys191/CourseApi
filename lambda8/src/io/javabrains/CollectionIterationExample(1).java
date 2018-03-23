package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Adil","Adilov","Astana"),
                new Person("CAdil3","CAdilov3","Astana"),
                new Person("BAdil4","CAdilov4","Astana"),
                new Person("CAdil2","Adilov2","Astana")
        );

       System.out.println(" Using for loop::: ");

       people.forEach(p -> System.out.println(p));

    }
}
