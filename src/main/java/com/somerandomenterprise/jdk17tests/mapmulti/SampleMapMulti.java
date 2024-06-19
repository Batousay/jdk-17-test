package com.somerandomenterprise.jdk17tests.mapmulti;

import java.util.List;
import java.util.stream.Stream;

public class SampleMapMulti {
    public static class FruitList{
        public List<String> fruits = List.of("pen ", "banana", "pineapple ", "apple ", "banana", "orange", "pen", "tomato", "kiwi");
    }

    public static void multiMap() {
        Stream.of("pen ", "banana", "pineapple ", "apple ", "banana", "orange", "pen", "tomato", "kiwi")
            .mapMulti((fruit, consumer) -> {
                if (fruit.startsWith("a") || fruit.startsWith("p")) {
                    consumer.accept(fruit.toUpperCase());
                }
            })
            .forEach(System.out::print);
    }

    public static void withFilter() {
        Stream.of("pen ", "banana", "pineapple ", "apple ", "banana", "orange", "pen", "tomato", "kiwi")
            .filter(fruit -> fruit.startsWith("a") || fruit.startsWith("p"))
            .map(String::toUpperCase)
            .forEach(System.out::print);
    }

    public static void withFlatMap() {
        Stream.of(new FruitList(), new FruitList(), new FruitList())
            .flatMap(fruit -> fruit.fruits.stream())
            .filter(fruit -> fruit.startsWith("a") || fruit.startsWith("p"))
            .map(String::toUpperCase)
            .forEach(System.out::print);
    }

    public static void multiListWithMultiMap() {
        Stream.of(new FruitList(), new FruitList(), new FruitList())
            .mapMulti((fruitList, consumer) ->
                fruitList.fruits.forEach(fruit -> {
                    if (fruit.startsWith("a") || fruit.startsWith("p")) {
                        consumer.accept(fruit.toUpperCase());
                    }
                }))
            .forEach(System.out::print);
    }
}
