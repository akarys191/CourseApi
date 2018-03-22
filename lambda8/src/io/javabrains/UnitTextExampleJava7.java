package io.javabrains;

import java.util.*;
import java.util.concurrent.locks.Condition;

public class UnitTextExampleJava7 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Adil","Adilov","Astana"),
                new Person("CAdil3","CAdilov3","Astana"),
                new Person("CAdil4","CAdilov4","Astana"),
                new Person("BAdil2","Adilov2","Astana")
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getfNlName().compareTo(o2.getfNlName());
            }
        });
        printALl(people);
        printWthCondition(people, new Condition() {
            @Override
            public boolean test(Person p){
               return  p.getfNlName().startsWith("C");
            }
        });
    }

    public static void printALl(List<Person> people){
        for(Person person:people)
        System.out.println(person.toString());
    }

    public static void printWthCondition(List<Person> people, Condition condition){
        for(Person person:people) {
            if(condition.test(person))
            System.out.println(person.toString());
        }
    }


}
