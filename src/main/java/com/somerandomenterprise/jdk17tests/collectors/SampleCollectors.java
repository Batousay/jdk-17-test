package com.somerandomenterprise.jdk17tests.collectors;

import java.util.HashMap;
import java.util.List;

public class SampleCollectors {
    public static void sampleCollectors() {
        List<String> fruits = List.of("apple", "banana", "orange", "apple", "banana", "orange");
        List<String> fruitCount = fruits.stream()
            .map(String::toUpperCase)
            .filter(fruit -> fruit.length() > 5)
            .toList();
        System.out.println(fruitCount);
    }

}
