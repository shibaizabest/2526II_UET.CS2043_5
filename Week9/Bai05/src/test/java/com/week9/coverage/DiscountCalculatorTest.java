package com.week9.coverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

  private final DiscountCalculator calculator = new DiscountCalculator();

  @Test
  void highValueOrderReceivesDiscount() {
    assertEquals(900_000, calculator.calculate(1_000_000, false));
  }

  @Test
  void vipCustomerReceivesDiscount() {
    assertEquals(90_000, calculator.calculate(100_000, true));
  }

  @Test
  void regularOrderKeepsSubtotal() {
    assertEquals(100_000, calculator.calculate(100_000, false));
  }

  @Test
  void negativeSubtotalFails() {
    assertThrows(IllegalArgumentException.class, () -> calculator.calculate(-1, false));
  }
}
