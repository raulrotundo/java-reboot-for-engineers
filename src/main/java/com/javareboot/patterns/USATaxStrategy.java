package com.javareboot.patterns;

public class USATaxStrategy implements TaxStrategy { public double calculate(double amount) { return amount * 0.07; } }
