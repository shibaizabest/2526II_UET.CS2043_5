package com.week9.review;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

  private final TaxCalculator calculator = new TaxCalculator();

  @Test
  void calculateVatReturnsTenPercent() {
    assertEquals(10_000, calculator.calculateVat(100_000));
  }

  @Test
  void negativeSubtotalFails() {
    assertThrows(IllegalArgumentException.class, () -> calculator.calculateVat(-1));
  }
}
