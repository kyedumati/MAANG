package com.maang.learn.dsa.corejava.java8;

import java.util.Arrays;
import java.util.List;

/**
 * foreach accepts a Consumer object, Consumer is functional interfaces which accept(T) an argument and return void
 **/
public class ForEach {

    public static void main(String []args) {
        List<Integer> nums = Arrays.asList(4,5,6,7);
        nums.forEach(System.out::println);

        List<Person> personList = Arrays.asList(new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Mathew", "Arnold", 39)
        );
        personList.forEach(System.out::println);       // foreach with method reference
        personList.forEach(p-> System.out.println(p)); // foreach with lambda

        for(Person p: personList) {
            System.out.println(p);
        }
    }
}
