package com.week9.math;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MathService.class);

  public int add(int left, int right) {
    int result = left + right;
    LOGGER.info("Add completed left={} right={} result={}", left, right, result);
    return result;
  }

  public int divide(int dividend, int divisor) {
    if (divisor == 0) {
      LOGGER.error("Divide rejected dividend={} divisor={}", dividend, divisor);
      throw new IllegalArgumentException("Divisor must not be zero");
    }
    int result = dividend / divisor;
    LOGGER.info("Divide completed dividend={} divisor={} result={}", dividend, divisor, result);
    return result;
  }
}
