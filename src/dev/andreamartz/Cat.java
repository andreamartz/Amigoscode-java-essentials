package dev.andreamartz;

public class Cat extends Animal {
//    String name;
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("miaow miaow");
    }
}
