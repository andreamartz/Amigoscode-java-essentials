package dev.andreamartz;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("bobby");
        Dog dog = new Dog("flex", "Bulldog");
        System.out.println(animal.getName());
        System.out.println(dog);
//        System.out.println(dog.getName() + " is a " + dog.getBreed());

    }

    // *************************************************************
    // Getting Started - Pass by value and pass by reference
    // *************************************************************
    public class PassByValVsRef {
        public static void main(String[] args) {
            int x = 0;
            int y = incrementValue(x);
            System.out.println(x);  // 0
            System.out.println(y);  // 1
            Point point = new Point(100, 100);
            changePoint(point);
            System.out.println(point);    //  java.awt.Point[x=0,y=0], NOT x=100, y=100, because point is a reference type
        }

        static void changePoint(Point point) {
            point.x = 0;
            point.y = 0;
        }

        static int incrementValue(int value) {
            return value + 1;
        }

        // Pass by value lecture
            // 4:40 "you should never mutate primitives here   value = value + 1
            // instead, return a brand new one"
    }
}