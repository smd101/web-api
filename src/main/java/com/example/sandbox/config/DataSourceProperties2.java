package com.example.sandbox.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@ConfigurationProperties("spring.datasource.data2")
public class DataSourceProperties2 {
  private String driverClassName;
  private String url;
  private String username;
  private String password;

}