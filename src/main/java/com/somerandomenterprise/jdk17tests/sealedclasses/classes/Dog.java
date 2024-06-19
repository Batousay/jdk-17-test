package com.somerandomenterprise.jdk17tests.sealedclasses.classes;

public non-sealed class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }

    public String bark() {
        return "Bark";
    }
}
