package com.maang.learn.dsa.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Method reference can be replaced by lamda expresion
 */
public class MethodReferenceExample1 {

    static void printMessage() {
        System.out.println("Inside print message");
    }

    static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: persons) {
            if(predicate.test(p)) {
                // System.out.println(p);
                consumer.accept(p);
            }
        }
    }

    public static void main(String[] args){
        Thread th1= new Thread(() -> System.out.println("inside thread"));  // here lamda is implementation of Runnable
        th1.start();

        Thread th2= new Thread(MethodReferenceExample1::printMessage);//MethodReferenceExample1::printMessage same as () -> printMessage()
        th2.start();

        List<Person> personList = Arrays.asList(new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Mathew", "Arnold", 39)
        );

        //print all persons
        printConditionally(personList, p -> true, p-> System.out.println(p));

        printConditionally(personList, p -> true, System.out::println); // this is same as p-> System.out.println(p)


    }

}
