package com.maang.learn.dsa.corejava.java8;

import java.sql.Connection;

/**
 * Since java8 onwards, interfaces allows to create default and static methods
 *
 * Advantages:
 * We can write common functionality without impacting child classes/interfaces
 *
 * Static methods: can be accessed without object, and cannot be overriden
 * Default methodS: needs object to access
 */

interface ITest {

    int sum(int a, int b);

    default void show() {
        System.out.println("ITest");
    }

    static Connection getDbConnection() {
        return null;
    }
}

class TestImpl implements ITest {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}


public class InterfacesDefaultAndStatic {

    public static void main(String[] args) {
        System.out.println(ITest.getDbConnection());
        ITest testObj = new TestImpl();
        System.out.println(testObj.sum(3,4));
        testObj.show();
    }
}
