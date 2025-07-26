package com.javareboot.refactoring;

// RefactoringDemo illustrates SOLID principles, code smells, and clean code practices.
// SOLID is a set of five design principles for writing maintainable and extensible software:
// - Single Responsibility Principle (SRP): a class should have one reason to change.
// - Open/Closed Principle (OCP): classes should be open for extension, closed for modification.
// - Liskov Substitution Principle (LSP): subclasses should be substitutable for their base classes.
// - Interface Segregation Principle (ISP): prefer small, specific interfaces.
// - Dependency Inversion Principle (DIP): depend on abstractions, not concretions.
// Code smells are symptoms of poor design that may hinder maintainability.
//
// Theory:
// - Refactoring is the process of improving code structure without changing its behavior.
// - SOLID principles help you write code that is easier to maintain, test, and extend.
// - Code smells are warning signs that code may need refactoring (e.g., long methods, duplicated code).
public class RefactoringDemo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("== Refactoring Demo ==");

        // Open/Closed Principle: Shape interface allows extension (new shapes) without modifying existing code.
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());

        // Code smell: long method doing too much (violates SRP).
        Smelly smelly = new Smelly();
        smelly.doSomething();

        // Refactored: split logic into smaller, focused methods (adheres to SRP).
        Clean clean = new Clean();
        clean.doSomething();
    }
}

// Code Smell Example: method violates Single Responsibility Principle (SRP).
// Doing too much in one method makes code harder to read, test, and maintain.
// Theory: Long methods are harder to understand and modify.
class Smelly {
    public void doSomething() {
        System.out.println("Doing too much in one method...");
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        // ...imagine more steps...
    }
}

// Clean Code: refactored for readability and maintainability.
// Each step is separated into its own method, making the code easier to understand and modify.
// Theory: Small, focused methods improve clarity and testability.
class Clean {
    public void doSomething() {
        step1();
        step2();
        step3();
    }
    private void step1() { System.out.println("Step 1"); }
    private void step2() { System.out.println("Step 2"); }
    private void step3() { System.out.println("Step 3"); }
}
