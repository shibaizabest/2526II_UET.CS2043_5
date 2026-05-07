package com.week9.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

  private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

  public String confirmOrder(String orderId, double total) {
    if (orderId == null || orderId.isBlank()) {
      LOGGER.error("Order confirmation failed reason=missing_order_id total={}", total);
      throw new IllegalArgumentException("Order id is required");
    }
    if (total <= 0) {
      LOGGER.error("Order confirmation failed orderId={} total={}", orderId, total);
      throw new IllegalArgumentException("Total must be positive");
    }
    LOGGER.info("Order confirmed orderId={} total={}", orderId, total);
    return "CONFIRMED-" + orderId;
  }
}
