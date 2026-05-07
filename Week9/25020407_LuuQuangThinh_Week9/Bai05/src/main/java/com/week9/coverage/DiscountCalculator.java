package com.week9.coverage;

public class DiscountCalculator {

  public double calculate(double subtotal, boolean vipCustomer) {
    if (subtotal < 0) {
      throw new IllegalArgumentException("Subtotal must not be negative");
    }
    if (subtotal >= 1_000_000 || vipCustomer) {
      return subtotal * 0.9;
    }
    return subtotal;
  }
}
