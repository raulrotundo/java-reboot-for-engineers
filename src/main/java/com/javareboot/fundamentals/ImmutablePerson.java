package com.javareboot.fundamentals;

// Example of a custom immutable class
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // No setters; only getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // "with" methods return a new instance with modified state
    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(this.name, newAge);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
