/*
 * Copyright (c) 2017, Robert Bosch (Suzhou) All Rights Reserved. This software is property of
 * Robert Bosch (Suzhou). Unauthorized duplication and disclosure to third parties is prohibited.
 */
package com.iboitech.util;

import org.apache.commons.lang.StringUtils;

import com.openthinks.plc.core.ApplicationConfiguration;

import net.sourceforge.springframework.SpringContext;

/**
 * ClassName: PathUtil <br/>
 * date: Jul 24, 2017 10:56:43 AM <br/>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
public abstract class PathUtil {

  public static String basePath() {
    return SpringContext.getContext().getBean(ApplicationConfiguration.class).getBasePath();
  }

  public static String staticPath() {
    return SpringContext.getContext().getBean(ApplicationConfiguration.class).getStaticUri();
  }

  public static String path(String relativePath) {
    return StringUtils.removeEnd(basePath(), "/") + "/"
        + StringUtils.removeStart(relativePath, "/");
  }

  // 静态资源
  public static String pathStatic(String relativePath) {
    return StringUtils.removeEnd(staticPath(), "/") + "/"
        + StringUtils.removeStart(relativePath, "/");
  }

  public static String pathDo(String relativePath, Object arg) {
    return pathSuffix(relativePath, ".do", arg);
  }

  public static String pathJhtml(String relativePath, Object arg) {
    return pathSuffix(relativePath, ".jhtml", arg);
  }

  public static String pathDo(String relativePath) {
    return pathSuffix(relativePath, ".do");
  }

  public static String pathJhtml(String relativePath) {
    return pathSuffix(relativePath, ".jhtml");
  }

  static String pathSuffix(String relativePath, String suffix, Object arg) {
    String placehoder = path(relativePath).concat(suffix);
    return String.format(placehoder, arg);
  }

  static String pathSuffix(String relativePath, String suffix) {
    String placehoder = path(relativePath).concat(suffix);
    return placehoder;
  }

}
