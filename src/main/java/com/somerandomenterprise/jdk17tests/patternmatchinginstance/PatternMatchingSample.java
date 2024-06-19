package com.somerandomenterprise.jdk17tests.patternmatchinginstance;

import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Animal;
import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Cat;
import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Dog;
import com.somerandomenterprise.jdk17tests.sealedclasses.interfaces.Fruit;
import com.somerandomenterprise.jdk17tests.sealedclasses.interfaces.Tomato;

public class PatternMatchingSample {

    public static void sampleMatching() {
        Animal cat = new Cat();
        if (cat instanceof Cat) {
            Cat c = (Cat) cat;
            System.out.println(c.purr());
        }

        Animal dog = new Dog();
        if (dog instanceof Dog d) {
            System.out.println(d.bark());
        }

        Object animal = new Animal();
        if (animal instanceof Animal a) {
            System.out.println(a.makeSound());
        }

        Object tomato = new Tomato();
        if (tomato instanceof Fruit f && f.readyToCollect()) {
            System.out.println("Really? Tomato is a Fruit?");
        }
    }
}
