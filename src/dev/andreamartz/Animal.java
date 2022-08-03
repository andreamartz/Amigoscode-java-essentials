package dev.andreamartz;

// this is an abstract class
    // abstract classes can have abstract methods as well as other methods
abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // When a method on a (abstract) class is abstract, it means that anyone who extends the class MUST implement that method
        // the method definition on the class has no implementation
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
