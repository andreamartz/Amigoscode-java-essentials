package dev.andreamartz;
// IMPLEMENT an interface (contrast with EXTENDING a class)
public class CatFromInterface implements AnimalInterface {
    private String name;

    public CatFromInterface(String name) {
        // no access to `super` (i.e., parent class) now since we are implementing an interface (not extending a class)
//        super(name);
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("miaow miaow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
