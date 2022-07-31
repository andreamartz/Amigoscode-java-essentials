package dev.andreamartz;

// Inheritance
public class Dog extends Animal {
    // Dog can have its own properties:
    private String breed;

    public Dog(String name, String breed) {
        // super(name) means that name will be passed to the super (i.e., parent) class (of Animal in this case)
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "breed='" + breed + '\'' +
//                '}';
//    }
}
