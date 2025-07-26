package com.javareboot.fundamentals;

// The Person class demonstrates encapsulation and validation.
// Encapsulation means keeping fields private and exposing behavior via public methods.
// Validation ensures that the object's state remains consistent and correct.
//
// Theory:
// - Constructors are special methods used to initialize new objects.
// - Methods define the behavior of objects.
// - Setters can enforce rules, such as not allowing negative ages.
//
// About 'final':
// - The 'final' keyword means the variable can only be assigned once.
// - For fields, 'final' ensures immutability for that field after construction.
// - Use 'final' when you want to guarantee that the value will not change after initialization.
// - This is especially useful for fields that should be constant for the lifetime of the object (e.g., a person's name).
//
// Theory: Primitive Data Types vs Wrapper Classes
// - Primitive data types (e.g., int, double, boolean) are basic types that store simple values directly.
// - Wrapper classes (e.g., Integer, Double, Boolean) are objects that encapsulate primitive types and provide additional methods.
// - Primitives are more memory-efficient and faster, but cannot be null and do not have methods.
// - Wrappers can be null, used in collections, and have utility methods, but are less efficient.
// - Example: 'age' is an int (primitive), while 'name' is a String (which is a class, not a primitive).
//   If you used Integer for age, you could assign null and use methods like compareTo, but for most cases int is preferred for performance.

public class Person {
    private final String name; // 'final' means name cannot be changed after construction
    private int age;

    // Constructor: special method to initialize new objects
    public Person(String name, int age) {
        this.name = name; // 'name' must be assigned here and cannot be changed later
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
