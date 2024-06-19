package com.somerandomenterprise.jdk17tests.sealedclasses.classes;

public sealed class Animal permits Dog, Cat {
    public String makeSound() {
        return "Some sound";
    }
}
