package com.maang.learn.dsa.corejava.java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

final class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Firstname:" + this.getFirstName() + " LastName: "+ this.getLastName() + " Age:"+ this.getAge();
    }
}

public class LambdaExercises {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Mathew", "Arnold", 39)
                );
        //Step1: Sort list by last name
        Comparator<Person> comparator = (obj1, obj2) -> obj1.getLastName().compareTo(obj2.getLastName());
        Collections.sort(personList, comparator);

        //Step2: Create a method that prints all elements in the list
       // personList.forEach((person -> System.out.println(person)));
        printConditionally(personList, p-> true, p->System.out.println(p)); // condition always true to print everything

        //Step3: Create a method that prints all people that have last name starts with "C"
        printConditionally(personList, (p) -> p.getLastName().startsWith("C"), p-> System.out.println(p));

    }

 //   static void printConditionally(List<Person> persons, Condition condition) { // using our custom functional interface
    static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: persons) {
            if(predicate.test(p)) {
               // System.out.println(p);
                consumer.accept(p);
            }
        }
    }
}

interface Condition {
    boolean check(Person p);
}
