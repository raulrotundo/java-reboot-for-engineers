package com.javareboot;

import com.javareboot.fundamentals.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FundamentalsDemoTest {
    @Test
    void personGreetReturnsExpectedString() {
        Person person = new Person("Test", 20);
        assertEquals("Hello, my name is Test and I'm 20 years old.", person.greet());
    }

    @Test
    void setAgeThrowsExceptionForNegativeAge() {
        Person person = new Person("Test", 20);
        assertThrows(IllegalArgumentException.class, () -> person.setAge(-5));
    }
}

