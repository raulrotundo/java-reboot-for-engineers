package com.javareboot.fundamentals;

// Immutability means that once an object is created, its state cannot be changed.
// Immutable objects are inherently thread-safe and easier to reason about.
// In Java, String is a classic example of an immutable class.
// You can also create your own immutable classes by making fields final and not providing setters.

public class ImmutabilityDemo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("== Immutability Demo ==");

        // String immutability
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original: " + original); // "Hello"
        System.out.println("Modified: " + modified); // "Hello World"
        // The original String is unchanged; concat returns a new String.

        // Custom immutable class
        ImmutablePerson person = new ImmutablePerson("Alice", 30);
        System.out.println(person);
        // No setters, fields are final, so person cannot be changed after creation.

        // Attempting to "change" immutable object creates a new instance
        ImmutablePerson older = person.withAge(31);
        System.out.println("Older: " + older);
        System.out.println("Original remains: " + person);
    }
}

