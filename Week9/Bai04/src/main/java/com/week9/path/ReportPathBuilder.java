package com.week9.path;

import java.nio.file.Path;

public class ReportPathBuilder {

  public Path buildReportPath(String root, String fileName) {
    if (root == null || root.isBlank()) {
      throw new IllegalArgumentException("Root is required");
    }
    if (fileName == null || fileName.isBlank()) {
      throw new IllegalArgumentException("File name is required");
    }
    return Path.of(root).resolve("reports").resolve(fileName);
  }
}
