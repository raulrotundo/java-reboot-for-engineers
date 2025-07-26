package com.javareboot.patterns;

public class EuropeTaxStrategy implements TaxStrategy { public double calculate(double amount) { return amount * 0.20; } }
