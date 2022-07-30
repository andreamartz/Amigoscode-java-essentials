package dev.andreamartz.foo;

import dev.andreamartz.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        // we are inside the foo package, not DIRECTLY inside the dev.andreamartz package
        // so, we won't be able to access the Lens class from AccessModifiers.java (which IS directly inside the dev.andreamartz package

        // uncomment this and you will see the error:
//        AccessModifiers.Lens lens = new AccessModifiers.Lens();
    }
}
