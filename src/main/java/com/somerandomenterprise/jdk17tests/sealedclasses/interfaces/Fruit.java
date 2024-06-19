package com.somerandomenterprise.jdk17tests.sealedclasses.interfaces;

public sealed interface Fruit permits Fruit.Citrus, Tomato {
    Boolean readyToCollect();
    
    non-sealed interface Citrus extends Fruit {
        public String getVitaminC();
    }
}
