package com.week9.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OrderServiceTest {

  private final OrderService orderService = new OrderService();

  @Test
  void confirmOrderReturnsConfirmationCode() {
    assertEquals("CONFIRMED-ORD-001", orderService.confirmOrder("ORD-001", 250_000));
  }

  @Test
  void invalidOrderFails() {
    assertThrows(IllegalArgumentException.class, () -> orderService.confirmOrder("", 250_000));
  }
}
