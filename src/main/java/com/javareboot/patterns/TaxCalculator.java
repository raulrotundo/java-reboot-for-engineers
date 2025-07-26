package com.javareboot.patterns;

public class TaxCalculator {
    private TaxStrategy strategy;
    public TaxCalculator(TaxStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(TaxStrategy strategy) { this.strategy = strategy; }
    public double calculate(double amount) { return strategy.calculate(amount); }
}
