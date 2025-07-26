package com.javareboot.fundamentals;

// The Person class demonstrates encapsulation and validation.
// Encapsulation means keeping fields private and exposing behavior via public methods.
// Validation ensures that the object's state remains consistent and correct.
//
// Theory:
// - Constructors are special methods used to initialize new objects.
// - Methods define the behavior of objects.
// - Setters can enforce rules, such as not allowing negative ages.
public class Person {
    private String name; // Fields store object state
    private int age;

    // Constructor: special method to initialize new objects
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Using setter for validation
    }

    // Method: defines object behavior
    public String greet() {
        return "Hello, my name is " + name + " and I'm " + age + " years old.";
    }

    // Setter with validation: prevents invalid state (negative age)
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }
}
