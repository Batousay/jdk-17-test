package com.somerandomenterprise.jdk17tests.sealedclasses.interfaces;

import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Dog;

public final class Tomato extends Dog implements Fruit {
    @Override
    public String makeSound() {
        return "Squishy sound";
    }

    @Override
    public Boolean readyToCollect() {
        return true;
    }
}
