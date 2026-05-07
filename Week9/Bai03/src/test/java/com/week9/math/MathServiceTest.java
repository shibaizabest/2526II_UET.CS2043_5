package com.week9.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathServiceTest {

  private final MathService mathService = new MathService();

  @Test
  void addReturnsSum() {
    assertEquals(7, mathService.add(3, 4));
  }

  @Test
  void divideReturnsQuotient() {
    assertEquals(5, mathService.divide(10, 2));
  }

  @Test
  void divideByZeroFails() {
    assertThrows(IllegalArgumentException.class, () -> mathService.divide(10, 0));
  }
}
