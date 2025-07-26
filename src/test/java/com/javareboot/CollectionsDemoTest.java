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
}

