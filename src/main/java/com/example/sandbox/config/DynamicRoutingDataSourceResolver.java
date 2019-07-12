package com.example.sandbox.config;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class DynamicRoutingDataSourceResolver extends AbstractRoutingDataSource {

  @Override
  protected Object determineCurrentLookupKey() {
    if(SchemaContextHolder.getSchemaType() == null) {
      return "dataSource1";
    } else if(SchemaContextHolder.getSchemaType() == SchemaType.DATA1) {
      return "dataSource1";
    } else if(SchemaContextHolder.getSchemaType() == SchemaType.DATA2) {
      return "dataSource2";
    } else {
      return "dataSource1";
    }
  }


}