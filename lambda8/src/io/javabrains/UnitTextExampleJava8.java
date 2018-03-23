package io.javabrains;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class UnitTextExampleJava8 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Adil","Adilov","Astana"),
                new Person("CAdil3","CAdilov3","Astana"),
                new Person("BAdil4","CAdilov4","Astana"),
                new Person("CAdil2","Adilov2","Astana")
        );

        Collections.sort(people, (p1, p2) -> p1.getfNlName().compareTo(p2.getfNlName()));
        printALl(people);
        printWthCondition(people,person -> true);
        printWthCondition(people,person -> person.getfName().startsWith("C") );
        printWthCondition(people,person -> person.getfName().startsWith("C") );
    }

    public static void printALl(List<Person> people){
        for(Person person:people)
        System.out.println(person.toString());
    }

    public static void printWthCondition(List<Person> people, Predicate<Person> condition){
        System.out.println();

        for(Person person:people) {
            if(condition.test(person))
            System.out.println(person.toString());
        }
    }



}
