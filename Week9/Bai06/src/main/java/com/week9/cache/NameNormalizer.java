package com.week9.cache;

import org.apache.commons.lang3.StringUtils;

public class NameNormalizer {

  public String normalize(String value) {
    if (StringUtils.isBlank(value)) {
      return "";
    }
    return StringUtils.normalizeSpace(value).toLowerCase();
  }
}
