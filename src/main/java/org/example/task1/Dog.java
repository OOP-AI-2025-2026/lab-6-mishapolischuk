package org.example.task1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    String makeSound() {
        return "Woof";
    }
}