package com.javareboot;

import com.javareboot.fundamentals.ImmutablePerson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImmutabilityDemoTest {

    @Test
    void stringIsImmutable() {
        String original = "Hello";
        String modified = original.concat(" World");
        assertEquals("Hello", original);
        assertEquals("Hello World", modified);
    }

    @Test
    void immutablePersonCannotBeChanged() {
        ImmutablePerson person = new ImmutablePerson("Alice", 30);
        ImmutablePerson older = person.withAge(31);
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
        assertEquals(31, older.getAge());
        assertNotSame(person, older);
    }
}
