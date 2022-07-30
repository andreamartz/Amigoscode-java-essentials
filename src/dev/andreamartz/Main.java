package dev.andreamartz;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b =  " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        alex.name = "Alexander";  // this will change Mariam's name also!
    }
    // *************************************************************
    // Getting Started - Primitive and Reference Types differences
    // *************************************************************

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    // *************************************************************
    // Getting Started - Pass by value and pass by reference
    // *************************************************************
    public class PassByValVsRef {
        public static void main(String[] args) {
            int x = 0;
            incrementValue(x);
            System.out.println(x);  // prints 0 NOT 1
        }
        static void incrementValue(int value) {
            value++;
        }

        // Pass by value lecture
            // 4:40 "you should never mutate primitives here   value = value + 1
            // instead, return a brand new one"
    }
}