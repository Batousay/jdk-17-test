package com.somerandomenterprise.jdk17tests.sealedclasses.classes;

public final class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }

    public String purr() {
        return "Purr";
    }
}
