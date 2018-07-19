package com.openthinks.plc.core;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {
  Logger logger = Logger.getLogger(getClass());

  private String appRoot = "";

  @Value("${platform.staticUri}")
  private String staticUri;

  @Value("${platform.sassUri}")
  private String sassUri;

  @Value("${platform.appHost}")
  private String appHost;

  @Value("${platform.dateFormat}")
  private String dateFormat;



  /**
   * get public configured properties
   * 
   * @return Map
   */
  public Map<String, Object> getPublicProperties() {
    Map<String, Object> map = new HashMap<>();
    Field[] fields = ApplicationConfiguration.class.getDeclaredFields();
    for (Field field : fields) {
      Value annotation = field.getAnnotation(Value.class);
      if (annotation != null) {
        field.setAccessible(true);
        try {
          String key = field.getName();
          Object value = field.get(this);
          map.put(key, value);
        } catch (IllegalArgumentException e) {
          throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
          throw new RuntimeException(e);
        }
      }
    }
    map.put("staticUri", getStaticUri());
    map.put("appHost", getAppHost());
    return map;
  }


  public String getSassUri() {
    return getUri(sassUri);
  }

  public String getStaticUri() {
    return getUri(staticUri);
  }

  protected String getUri(String uri) {
    if (uri != null && !uri.endsWith("/")) {
      return uri + "/";
    }
    return uri;
  }

  public String getAppHost() {
    return getUri(appHost);
  }

  public void setAppHost(String appHost) {
    this.appHost = appHost;
  }

  public void setStaticUri(String staticUri) {
    this.staticUri = staticUri;
  }

  public void setSassUri(String sassUri) {
    this.sassUri = sassUri;
  }

  /**
   * full format date with time
   * 
   * @param date {@link Date}
   * @return String
   */
  public String fullFormat(Date date) {
    if (date == null)
      return null;
    DateFormat fullFormatObj = new SimpleDateFormat(dateFormat);
    return fullFormatObj.format(date);
  }

  /**
   * short format date without time
   * 
   * @param date {@link Date}
   * @return String
   */
  public String shortFormat(Date date) {
    if (date == null)
      return null;
    DateFormat shortFormatObj = new SimpleDateFormat(getShortDateFormat());
    return shortFormatObj.format(date);
  }

  /**
   * full parse date with time
   * 
   * @param dateStr String
   * @return {@link Date}
   * @throws ParseException
   */
  public Date fullParse(String dateStr) throws ParseException {
    DateFormat fullFormatObj = new SimpleDateFormat(dateFormat);
    return fullFormatObj.parse(dateStr);
  }

  /**
   * short parse date without time
   * 
   * @param dateStr String
   * @return {@link Date}
   * @throws ParseException
   */
  public Date shortParse(String dateStr) throws ParseException {
    DateFormat shortFormatObj = new SimpleDateFormat(getShortDateFormat());
    return shortFormatObj.parse(dateStr);
  }

  public final String getFullDateFormat() {
    return dateFormat;
  }

  /**
   * get short date format pattern without time
   * 
   * @return String
   */
  public final String getShortDateFormat() {
    if (StringUtils.isNotBlank(dateFormat)) {
      String[] formats = StringUtils.split(StringUtils.trim(dateFormat), " ");
      if (formats.length > 0) {
        return formats[0];
      }
    }
    return dateFormat;
  }

  public String getBasePath() {
    String basePath =
        StringUtils.removeEnd(this.appHost, "/") + "/" + StringUtils.removeStart(appRoot, "/");
    return StringUtils.removeEnd(basePath, "/");
  }

  public void setAppRoot(String appRoot) {
    this.appRoot = appRoot;
  }

}
