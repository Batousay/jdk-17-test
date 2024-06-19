package com.somerandomenterprise.jdk17tests.records;


public class PojoRecord {
    private final String name;
    private final Integer age;

    public PojoRecord(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }

    @Override
    public String toString() {
        return "PojoRecord{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PojoRecord)) return false;

        PojoRecord that = (PojoRecord) o;

        if (!name.equals(that.name)) return false;
        return age.equals(that.age);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }
}
