package com.week9.review;

public class TaxCalculator {

  public double calculateVat(double subtotal) {
    if (subtotal < 0) {
      throw new IllegalArgumentException("Subtotal must not be negative");
    }
    return subtotal * 0.1;
  }
}
