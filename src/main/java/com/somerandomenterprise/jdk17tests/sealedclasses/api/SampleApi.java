package com.somerandomenterprise.jdk17tests.sealedclasses.api;

import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Animal;

public class SampleApi {

    public static void storeAnimalSound(Animal animal) {
       /* switch(animal) {
            case Dog dog -> System.out.println("Dog sound: " + dog.bark());
            case Cat cat -> System.out.println("Cat sound: " + cat.purr());
        }*/

        System.out.println(animal.makeSound());
    }
}
