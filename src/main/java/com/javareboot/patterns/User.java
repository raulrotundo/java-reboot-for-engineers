package com.javareboot.patterns;

// Builder Pattern: builds objects with chained methods.
// Useful for constructing objects with many optional parameters.
// Implementation: Inner static Builder class with fluent setters.
public class User {
    private final String name;
    private final int age;
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    public static class Builder {
        private String name;
        private int age;
        public Builder name(String name) { this.name = name; return this; }
        public Builder age(int age) { this.age = age; return this; }
        public User build() { return new User(this); }
    }
    public String toString() { return name + " (" + age + ")"; }
}
