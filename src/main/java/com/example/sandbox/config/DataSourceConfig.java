package com.example.sandbox.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Configuration
@Component
public class DataSourceConfig {

  @Autowired
  DataSourceProperties1 datasource1;
  @Autowired
  DataSourceProperties2 datasource2;

  // @Bean
  public DataSource dataSource1() {
      DataSource ds = new  DataSource();
      ds.setDriverClassName(datasource1.getDriverClassName());
      ds.setUrl(datasource1.getUrl());
      ds.setUsername(datasource1.getUsername());
      ds.setPassword(datasource1.getPassword());
      return ds;
  }

  // @Bean
  public DataSource dataSource2() {
    DataSource ds = new  DataSource();
    ds.setDriverClassName(datasource2.getDriverClassName());
    ds.setUrl(datasource2.getUrl());
    ds.setUsername(datasource2.getUsername());
    ds.setPassword(datasource2.getPassword());
    return ds;
}

  // @Primary
  @Bean
  public DynamicRoutingDataSourceResolver dataSource() {
    DynamicRoutingDataSourceResolver resolver = new DynamicRoutingDataSourceResolver();

    Map<Object, Object> dataSources = new HashMap<Object, Object>();
    dataSources.put("dataSource1", dataSource1());
    dataSources.put("dataSource2", dataSource2());

    resolver.setTargetDataSources(dataSources);

    // default
    resolver.setDefaultTargetDataSource(dataSource1());

    return resolver;
  }

}