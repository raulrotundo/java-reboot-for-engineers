package com.javareboot.patterns;

// Design patterns are proven solutions to common software design problems.
// They provide templates for structuring code in a maintainable, extensible, and reusable way.
// This demo covers several classic patterns, each with a specific use case.
//
// Theory:
// - Factory: Abstracts object creation, promoting loose coupling.
// - Strategy: Allows dynamic selection of algorithms/behaviors.
// - Singleton: Restricts a class to a single instance, useful for shared resources.
// - Builder: Simplifies construction of complex objects.
// - Observer: Enables event-driven communication between objects.
// - Adapter: Bridges incompatible interfaces, aiding integration.
// - Command: Encapsulates actions as objects, supporting undo/redo and queuing.
public class PatternDemo {
    public static void run() {
        System.out.println("== Patterns Demo ==");

        // Factory Pattern: encapsulates object creation logic.
        // Useful when you want to abstract away the instantiation details.
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.createAnimal("dog");
        System.out.println(dog.speak());

        // Strategy Pattern: enables swappable algorithms/behaviors at runtime.
        // Promotes flexibility and separation of concerns.
        TaxCalculator calculator = new TaxCalculator(new USATaxStrategy());
        System.out.println("USA Tax: " + calculator.calculate(100));

        calculator.setStrategy(new EuropeTaxStrategy());
        System.out.println("Europe Tax: " + calculator.calculate(100));

        // Singleton Pattern: ensures a single instance for global access.
        // Useful for configuration or shared resources.
        Config config = Config.getInstance();
        System.out.println("Config value: " + config.getValue());

        // Builder Pattern: constructs complex objects step-by-step.
        // Improves readability and flexibility for object creation.
        User user = new User.Builder().name("Bob").age(25).build();
        System.out.println("User: " + user);

        // Observer Pattern: event-driven updates to registered listeners.
        // Decouples event source from event consumers.
        EventSource eventSource = new EventSource();
        eventSource.addListener(msg -> System.out.println("Received: " + msg));
        eventSource.notifyListeners("Hello Observers!");

        // Adapter Pattern: wraps legacy interfaces for compatibility.
        // Allows integration of old code with new interfaces.
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacyPrinter);
        printer.print("Adapter pattern in action!");

        // Command Pattern: encapsulates actions as objects.
        // Enables parameterization and queuing of requests.
        Command command = new PrintCommand("Command pattern!");
        command.execute();
    }
}

class Dog implements Animal { public String speak() { return "Woof!"; } }
class Cat implements Animal { public String speak() { return "Meow!"; } }

// Strategy Pattern: defines interchangeable algorithms.
// The behavior can be changed at runtime by swapping strategy implementations.
// Implementation: The context class delegates behavior to a strategy interface.
interface TaxStrategy { double calculate(double amount); }

// Observer Pattern: notifies listeners of events.
// Promotes loose coupling between event source and consumers.
// Implementation: Listeners register and are notified of events.
interface Listener { void update(String message); }
class EventSource {
    private final java.util.List<Listener> listeners = new java.util.ArrayList<>();
    public void addListener(Listener listener) { listeners.add(listener); }
    public void notifyListeners(String message) {
        listeners.forEach(l -> l.update(message));
    }
}

// Adapter Pattern: adapts legacy interface to new one.
// Enables integration of incompatible interfaces.
// Implementation: Adapter wraps legacy object and exposes new interface.
class LegacyPrinter { public void oldPrint(String msg) { System.out.println("Legacy: " + msg); } }
interface Printer { void print(String msg); }
class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;
    public PrinterAdapter(LegacyPrinter legacyPrinter) { this.legacyPrinter = legacyPrinter; }
    public void print(String msg) { legacyPrinter.oldPrint(msg); }
}

// Command Pattern: encapsulates a request as an object.
// Useful for parameterizing, queuing, and logging requests.
// Implementation: Command interface with concrete implementations.
interface Command { void execute(); }
class PrintCommand implements Command {
    private final String msg;
    public PrintCommand(String msg) { this.msg = msg; }
    public void execute() { System.out.println(msg); }
}
