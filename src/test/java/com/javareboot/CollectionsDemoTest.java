package com.javareboot;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CollectionsDemoTest {
    @Test
    void uniqueNamesSetHasNoDuplicates() {
        List<String> names = Arrays.asList("A", "B", "A");
        Set<String> unique = new HashSet<>(names);
        assertEquals(2, unique.size());
    }

    @Test
    void employeeMapReturnsCorrectNameForId() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        assertEquals("Bob", employeeMap.get(102));
    }

    @Test
    void setDoesNotAllowDuplicates() {
        Set<String> set = new HashSet<>();
        set.add("A");
        boolean firstAdd = set.add("B");
        boolean secondAdd = set.add("A"); // Attempt to add a duplicate
        assertTrue(firstAdd); // "B" was added
        assertFalse(secondAdd); // "A" was not added again
        assertEquals(2, set.size());
    }
}
