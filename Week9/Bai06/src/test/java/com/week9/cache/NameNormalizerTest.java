package com.week9.cache;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NameNormalizerTest {

  @Test
  void normalizeTrimsCollapsesSpacesAndLowerCases() {
    NameNormalizer normalizer = new NameNormalizer();

    assertEquals("nguyen van an", normalizer.normalize("  Nguyen   Van   An  "));
  }
}
