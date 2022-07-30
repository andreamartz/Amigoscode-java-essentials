package dev.andreamartz;

public class AccessModifiers {
    public static void main(String[] args) {
        // public is an access modifier and
        // it controls who can call the class
        // access modifiers:
            // can be absent - this means the class is package-protected
            // public - available everywhere
            // package-protected - can't access it outside of the package
            // private - only available from inside the class where it is defined
            // protected - we'll discuss later when we learn about inheritance
    }

    // the Lens class is "package-protected" because we didn't specify an access modifier:
    static class Lens {

    }
}
