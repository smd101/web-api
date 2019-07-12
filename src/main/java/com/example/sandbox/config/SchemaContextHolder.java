package com.example.sandbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;


@Configuration
@Component
public class SchemaContextHolder {

  private static ThreadLocal<SchemaType> contextHolder = new ThreadLocal<SchemaType>();

  public static void setSchemaType(SchemaType datasourcename) {
      Assert.notNull(datasourcename, "Schema type cannot be null.");
      contextHolder.set(datasourcename);
  }

  public static SchemaType getSchemaType() {
      return contextHolder.get();
  }

  public static void clear() {
      contextHolder.remove();
  }


}