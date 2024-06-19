package com.somerandomenterprise.jdk17tests;

import com.somerandomenterprise.jdk17tests.collectors.SampleCollectors;
import com.somerandomenterprise.jdk17tests.functionalswitch.SampleFunctionalSwitch;
import com.somerandomenterprise.jdk17tests.multiline.MultilineStrings;
import com.somerandomenterprise.jdk17tests.npe.SampleNullPointers;
import com.somerandomenterprise.jdk17tests.patternmatchinginstance.PatternMatchingSample;
import com.somerandomenterprise.jdk17tests.records.RecordUsage;
import com.somerandomenterprise.jdk17tests.sealedclasses.api.SampleApi;
import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Animal;
import com.somerandomenterprise.jdk17tests.sealedclasses.interfaces.Tomato;
import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Cat;
import com.somerandomenterprise.jdk17tests.sealedclasses.classes.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sealedClasses();

        MultilineStrings.printMultilineString();

        RecordUsage.useRecordsSample();

        PatternMatchingSample.sampleMatching();

        try {
            SampleNullPointers.breakEverything();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        SampleFunctionalSwitch.sampleFunctionalSwitch("apple");
        SampleFunctionalSwitch.oldSwitchStatement("tomato");

        SampleCollectors.sampleCollectors();
    }


    private static void sealedClasses() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();
        Tomato tomato = new Tomato();

        SampleApi.storeAnimalSound(dog);
        SampleApi.storeAnimalSound(cat);
        SampleApi.storeAnimalSound(animal);
        SampleApi.storeAnimalSound(tomato);// private constructor to hide the implicit public one
    }
}