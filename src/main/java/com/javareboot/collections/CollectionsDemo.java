package com.javareboot.collections;

import java.util.*;
import java.util.stream.Collectors;

// The CollectionsDemo class illustrates the Java Collections Framework.
// Collections are data structures for storing groups of objects.
// Java provides List (ordered, allows duplicates), Set (unique elements), and Map (key-value pairs).
// Generics (e.g., List<String>) allow type safety and code reuse.
// The Stream API enables functional-style operations on collections, such as filtering and mapping.
//
// Theory:
// - Collections are essential for managing groups of data efficiently.
// - Lists are indexed, Sets enforce uniqueness, Maps associate keys with values.
// - Generics allow you to specify the type of elements, preventing runtime type errors.
// - Streams provide a declarative way to process data, supporting operations like filter, map, and reduce.
public class CollectionsDemo {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("== Collections Demo ==");

        // List: ordered collection, allows duplicates. Backed by ArrayList here.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        // Set: unordered collection, no duplicates. HashSet uses hashing for fast lookup.
        Set<String> uniqueNames = new HashSet<>(names);

        // Map: stores key-value pairs. Here, we use a stream to build a map of name to length.
        Map<String, Integer> nameLengths = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        (existing, replacement) -> existing // Merge function for duplicate keys
                ));

        System.out.println("Names: " + names);
        System.out.println("Unique Names: " + uniqueNames);
        System.out.println("Name Lengths: " + nameLengths);

        // Stream API: enables declarative, functional-style processing of collections.
        // filter: selects elements matching a condition.
        // toList: gathers results into a new list
        // Theory: Streams allow you to chain operations and process data in a concise, readable way.
        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("A")) // Lambda expression for filtering
                .toList();
        System.out.println("Names starting with 'A': " + filtered);
    }
}
