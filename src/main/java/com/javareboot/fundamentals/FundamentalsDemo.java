package com.javareboot.fundamentals;

// This class demonstrates fundamental Java concepts:
// - Classes and objects (core of OOP)
// - Methods (object behavior)
// - Exception handling (robustness)
// - Encapsulation (data hiding and validation)
//
// Theory:
// - Object-Oriented Programming (OOP) is a paradigm based on "objects", which combine state (fields) and behavior (methods).
// - Encapsulation is the practice of hiding internal state and requiring all interaction to occur through methods.
// - Exception handling allows programs to deal with unexpected situations gracefully, improving reliability.
public class FundamentalsDemo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("== Fundamentals Demo ==");
        // Object instantiation: creating an instance of a class
        Person person = new Person("Alice", 30);
        // Method invocation: calling a method on an object
        System.out.println(person.greet());
        try {
            // Exception handling: using try-catch to handle runtime errors
            person.setAge(-1); // This will throw an exception due to invalid input
        } catch (IllegalArgumentException e) {
            // Catch block: handles the exception gracefully
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

