package dev.andreamartz;

// interfaces CANNOT have properties / fields; they also CANNOT have methods with implementations
    // the only thing an interface CAN have is abstract methods

// Note: a class can IMPLEMENT multiple interfaces, but a class can only EXTEND one class;
public interface AnimalInterface {
    // Because we can only have ABSTRACT methods here, it would be redundant to specify that the method is abstract:
    void makeSound();
    String getName();
}
