package dev.andreamartz;

public class Main {
    public static void main(String[] args) {
        // Getting Started - Primitive and Reference Types differences
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b =  " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        alex.name = "Alexander";  // this will change Mariam's name also!
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    // Getting Started -
}