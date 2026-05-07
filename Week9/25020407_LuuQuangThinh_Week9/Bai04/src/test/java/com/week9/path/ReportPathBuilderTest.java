package com.week9.path;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class ReportPathBuilderTest {

  @Test
  void buildReportPathUsesCurrentOperatingSystemSeparator() {
    ReportPathBuilder builder = new ReportPathBuilder();

    Path path = builder.buildReportPath("data", "summary.txt");

    assertEquals(Path.of("data", "reports", "summary.txt"), path);
  }
}
