package com.javareboot;

import com.javareboot.patterns.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatternDemoTest {

    @Test
    void factoryCreatesDog() {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.createAnimal("dog");
        assertEquals("Woof!", dog.speak());
    }

    @Test
    void singletonReturnsSameInstance() {
        Config c1 = Config.getInstance();
        Config c2 = Config.getInstance();
        assertSame(c1, c2);
    }

    @Test
    void strategyCalculatesTaxCorrectly() {
        TaxCalculator calculator = new TaxCalculator(new USATaxStrategy());
        // Floating-point comparison in strategyCalculatesTaxCorrectly by using assertEquals with a delta.
        assertEquals(7.0, calculator.calculate(100), 1e-9);
        calculator.setStrategy(new EuropeTaxStrategy());
        assertEquals(20.0, calculator.calculate(100), 1e-9);
    }

    @Test
    void builderCreatesUserCorrectly() {
        User user = new User.Builder().name("Alice").age(30).build();
        assertEquals("Alice (30)", user.toString());
    }
}
