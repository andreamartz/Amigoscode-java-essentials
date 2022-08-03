package dev.andreamartz;

// Polymorphism through method overloading means that "we can have the exact same method name, but with a different behavior and set of parameters
    // (a.k.a., COMPILE TIME polymorphism)
// Note: contrast this with runtime polymorphism, which happens when we use method overriding (i.e., @Override)

public class SuperMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
