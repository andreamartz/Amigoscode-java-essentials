package dev.andreamartz;

import java.util.ArrayList;
import java.util.List;

public class StaticKeyword {
    // static: whether it's a method or a variable, if it's static, it belongs to the class (not to instances of the class)
    // static is usually used to have shared data across all the instances of the class
    // static is also used to define constants

    public static String brand;
    public static final String BRAND = "amigoscodeBRAND";
    static List list;

    // another use of static is a static block like this one to initialize static fields:
    static {
        brand = "amigoscode";
        list = new ArrayList();
        list.add("something");
    }

    // public static void main is the entry point to every Java program, and it HAS TO BE static
    public static void main(String[] args) {
        Person alex = new Person("alex");
        Person bob = new Person("bob");
        System.out.println(alex.name);
        System.out.println(bob.name);
        System.out.println(alex.createdPeople);  // can do this, but the better way is to access createdPeople from the Person class since it is a static variable (i.e., it belongs to the Person class)
        System.out.println(Person.createdPeople);
    }

    // create a person class
    // Person has to be static bc we'll be using it in the static main method above
    static class Person {
        static int createdPeople = 0;
        String name;

        // constructor function Person:
        Person(String name) {
            // can access BRAND from here because BRAND is static, and we are in a static context here
            System.out.println(StaticKeyword.BRAND);
            this.name = name;
            createdPeople++;
        }
    }
}
