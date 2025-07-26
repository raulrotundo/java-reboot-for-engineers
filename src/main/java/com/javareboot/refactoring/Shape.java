package com.javareboot.refactoring;

// Open/Closed Principle: interface for extensibility.
// New shapes can be added by implementing Shape, without changing existing code.
// Implementation: Each shape provides its own area calculation.
public interface Shape { double area(); }
