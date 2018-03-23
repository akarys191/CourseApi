package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Adil","Adilov","Astana"),
                new Person("CAdil3","CAdilov3","Astana"),
                new Person("BAdil4","CAdilov4","Astana"),
                new Person("CAdil2","Adilov2","Astana")
        );

        Collections.sort(people, Comparator.comparing(Person::getfNlName));
        printALl(people);
        printWthCondition(people,person -> true, System.out::println);
    }

    public static void printALl(List<Person> people){
        for(Person person:people)
            System.out.println(person.toString());
    }

    public static void printWthCondition(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer){
        System.out.println();

        for(Person person:people) {
            if(condition.test(person))
                consumer.accept(person);
        }
    }



}