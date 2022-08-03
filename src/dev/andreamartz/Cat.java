package dev.andreamartz;

public class Cat extends Animal {
//    String name;
    public Cat(String name) {
        super(name);
    }
    @Override  // not necessary; the annotation is used for documentation
    public void makeSound() {
        System.out.println("miaow miaow");
    }
}
