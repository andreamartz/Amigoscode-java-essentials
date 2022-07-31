package dev.andreamartz;

public class PrimitivesAndWrapperClasses {
    public static void main(String[] args) {
        // number is a primitive, so it doesn't have methods associated with it
        int number = 1;

        // every primitive has an object equivalent
        // number2 is an object of type Integer, so it does have methods on it
        Integer number2 = 1;
        byte byteValue;
        byteValue = number2.byteValue();
        System.out.println(byteValue);
    }
}
