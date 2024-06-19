package com.somerandomenterprise.jdk17tests.records;

public record NewRecord(String name, Integer age) {
    public NewRecord {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
    }

    public String doSomethingFunny() {
        return "Funny";
    }
}
