package dev.andreamartz;

// Inheritance
public class DogFromInterface implements AnimalInterface {
    // Dog can have its own properties:
    private String breed;
    private String name;

    public DogFromInterface(String name, String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
