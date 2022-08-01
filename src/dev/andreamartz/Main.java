package dev.andreamartz;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("bobby");  // we cannot instantiate an abstract class
        Animal dog = new Dog("flex", "Bulldog");
        Animal cat = new Cat("rosie");

        // Polymorphism
            // dog and cat are both Animals...
            // ...but when we invoke the `makeSound` method, it takes two different forms
        dog.makeSound();
        cat.makeSound();

        // Polymorphism means that something takes many forms
            // for example, the `+` operator can mean different things depending on whether it is being used as a string operation or a mathematical operation
        System.out.println("A" + "B");
        System.out.println(1 + 2);
    }
}